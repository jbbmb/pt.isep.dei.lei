package lapr.project.controller;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import lapr.project.model.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.util.Date;
import java.util.List;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.Utilizador;

/**
 *
 * @author Utilizador
 */
public class XMLController implements java.io.Serializable {

    private final CentroExposicoes centroExpo;
    private final CriarExposicaoController criarExpo;
    private RegistarUtilizadorController registoUtilizadoresController;
    private final AtribuirStandsController atribuirStand;
    private final DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    private CriarCandidaturaExposicaoController criarCand;
    private AvaliarCandidaturaController avaliarC;
    private String id;
    private RegistoUtilizadores ru;
    private ConfirmarUtilizadorController cuctrl;
    private CriarStandController csCrtl;
    private DefinirFAEController FAEctrl;
    private Candidatura cand;
    private Atribuicao atribuicao;
    private AtribuirCandidaturaController acCtrl;
    private ListaFAE listaFAE;
    private RegistoExposicoes registoExpo;

    public XMLController(CentroExposicoes ce, String idOrganizador) {
        this.centroExpo = ce;
        this.id = idOrganizador;
        this.criarExpo = new CriarExposicaoController(ce);
        this.atribuirStand = new AtribuirStandsController(ce, idOrganizador);

    }

    public void DivideDados(File file) throws SAXException, IOException, ParseException {

        File ler = file;
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;

        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(ler);
            doc.getDocumentElement().normalize();
            NodeList nodeListUtilizadores = doc.getElementsByTagName("registoUtilizadoresConfirmados");
            for (int i = 0; i < nodeListUtilizadores.getLength(); i++) {
                NodeList nodeListUtilizadoresConfirmados = getChilds("utilizador", (Element) nodeListUtilizadores.item(i));
                for (int j = 0; j < nodeListUtilizadoresConfirmados.getLength(); j++) {
                    registoUtilizadoresController = new RegistarUtilizadorController(centroExpo);
                    registoUtilizadoresController.novoUtilizador();
                    String user = getUtilizador(nodeListUtilizadoresConfirmados.item(j));
                    ru = registoUtilizadoresController.getRegistoUtilizadores();
                    ru.confirmaUtilizador(user);
                }
            }

            NodeList nodeListUNC = doc.getElementsByTagName("registoUtilizadoresNaoConfirmados");
            for (int i = 0; i < nodeListUNC.getLength(); i++) {
                NodeList nodeListUtilizadoresNConfirmados = getChilds("utilizador", (Element) nodeListUNC.item(i));
                for (int j = 0; j < nodeListUtilizadoresNConfirmados.getLength(); j++) {
                    registoUtilizadoresController = new RegistarUtilizadorController(centroExpo);
                    registoUtilizadoresController.novoUtilizador();
                    getUtilizador(nodeListUtilizadoresNConfirmados.item(j));
                }
            }

            NodeList nodeListStands = doc.getElementsByTagName("stands");
            for (int i = 0; i < nodeListStands.getLength(); i++) {
                NodeList nodeListStand = getChilds("stand", (Element) nodeListStands.item(i));
                for (int j = 0; j < nodeListStand.getLength(); j++) {
                    this.registoUtilizadoresController = new RegistarUtilizadorController(centroExpo);
                    getStand(nodeListStand.item(j));
                }
            }
            NodeList nodeListRegistoExpo = doc.getElementsByTagName("registoExposicoes");
            for (int i = 0; i < nodeListRegistoExpo.getLength(); i++) {
                NodeList nodeListExpo = getChilds("exposicao", (Element) nodeListRegistoExpo.item(i));
                for (int j = 0; j < nodeListExpo.getLength(); j++) {
                    this.registoUtilizadoresController = new RegistarUtilizadorController(centroExpo);
                    getExposicao(nodeListExpo.item(j));

                }
            }

        } catch (ParserConfigurationException e1) {

        }

    }

    private String getUtilizador(Node item) {

        if (item.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) item;
            String nome = getTagValue("nome", element);
            String email = getTagValue("email", element);
            String user = getTagValue("username", element);
            String pass = getTagValue("password", element);
            String resposta = "";
            this.registoUtilizadoresController.setDadosUtilizador(nome, user, pass, email, resposta);
            this.registoUtilizadoresController.registarUtilizador();
            return user;
        }
        return null;
    }

    private void getStand(Node item) {
        if (item.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) item;
            String descricao = getTagValue("descricao", element);
            csCrtl = new CriarStandController(centroExpo);
            this.csCrtl.setDados(descricao);
            this.csCrtl.registarStand();

        }
    }

    private boolean getExposicao(Node item) throws ParseException {
        if (item.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) item;

            String titulo = getTagValue("titulo", element);
            String descricao = getTagValue("descricao", element);
            Date dataInicio = toDate("dataInicio", element);
            Date dataFim = toDate("dataFim", element);
            Date subInicio = toDate("subInicio", element);
            Date subFim = toDate("subFim", element);
            Date datalimiteConf = toDate("dataLimiteConflitos", element);
            String local = getTagValue("local", element);

            this.criarExpo.novaExposicao();
            this.criarExpo.setDados(titulo, descricao, dataInicio, dataFim, local, subInicio, subFim, datalimiteConf);

            NodeList nodeListRegistoOrg = getChilds("registoOrganizadores", element);
            for (int k = 0; k < nodeListRegistoOrg.getLength(); k++) {
                NodeList nodeListOrg = getChilds("organizador", (Element) nodeListRegistoOrg.item(k));
                for (int i = 0; i < nodeListOrg.getLength(); i++) {
                    String user = getUser(nodeListOrg.item(i));
                    Utilizador u = ru.getUtilizador(user);
                    this.criarExpo.addOrganizador(u);
                }
            }

//            if (this.criarExpo.getListaOrganizadores().getListaOrganizadores().size() >= 2) {
            this.criarExpo.registaExposicao();
//            }

            NodeList nodeListRegistoFAE = getChilds("registoFAEs", element);
            for (int k = 0; k < nodeListRegistoFAE.getLength(); k++) {
                NodeList nodeListFAE = getChilds("fae", (Element) nodeListRegistoFAE.item(k));
                for (int i = 0; i < nodeListFAE.getLength(); i++) {
                    String user = getUser(nodeListFAE.item(i));
                    Utilizador u = ru.getUtilizador(user);
                    FAEctrl = new DefinirFAEController(centroExpo);
                    this.FAEctrl.addFAE(u, criarExpo.getExposicao());
                    FAE fae = FAEctrl.getFae();
                    this.FAEctrl.registaFAE(fae);
                }
            }

            NodeList nodeListRegistoCand = getChilds("registoCandidaturas", element);
            for (int k = 0; k < nodeListRegistoCand.getLength(); k++) {
                NodeList nodeListCandidatura = getChilds("candidatura", (Element) nodeListRegistoCand.item(k));
                for (int i = 0; i < nodeListCandidatura.getLength(); i++) {
//                    getCandidatura(nodeListCandidatura.item(i), this.criarExpo.getExposicao());
                }
            }

        }
        return true;
    }

    private void getCandidatura(Node item, Exposicao exp) {
        if (item.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) item;
            String aceite = getTagValue("aceite", element);
            if (aceite.equalsIgnoreCase("true")) {
                aceite = "aceite";
            } else {
                aceite = "rejeitada";
            }
            String nomeEmpresa = getTagValue("nomeEmpresa", element);
            String morada = getTagValue("morada", element);
            String contacto = getTagValue("contacto", element);
            String descricao = getTagValue("descricao", element);
            String area = getTagValue("areaPretendida", element);
            String numConvites = getTagValue("quantidadeConvites", element);
            String id = getTagValue("idRepresentante", element);
            this.criarCand = new CriarCandidaturaExposicaoController(this.centroExpo, id);
            this.criarCand.novaCandidatura(exp);
            this.criarCand.setDados(nomeEmpresa, morada, contacto, Integer.parseInt(area), Integer.parseInt(numConvites), descricao);
            cand = criarCand.getCandidatura();

            NodeList nodeListRegistoAval = getChilds("avaliacoes", element);
            for (int k = 0; k < nodeListRegistoAval.getLength(); k++) {
                NodeList nodeListAvalia = getChilds("avaliacao", (Element) nodeListRegistoAval.item(k));
                for (int i = 0; i < nodeListAvalia.getLength(); i++) {
                    getAvaliacao(nodeListAvalia.item(i));
                }
            }
//            NodeList nodeListKeywords = getChilds("keywords", element);
//            for (int k = 0; k < nodeListKeywords.getLength(); k++) {
//                String keyword = getTagValue("keyword", element);
//                this.criarCand.addKeyword(keyword);
//            }
        }

    }

    private String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();
    }

    private NodeList getChilds(String tag, Element element) {
        return element.getElementsByTagName(tag);
    }

    private void getAvaliacao(Node item) {
        if (item.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) item;
            String texto = getTagValue("texto", element);
            String conhecimentoFAE = getTagValue("conhecimentoFAE", element);
            String adequacaoExposicao = getTagValue("adequacaoExposicao", element);
            String adequacaoDemonstracao = getTagValue("adequacaoDemonstracoes", element);
            String adequacaoConvites = getTagValue("adequacaoConvites", element);
            String recomendacao = getTagValue("adequacaoConvites", element);
            Utilizador u = null;

            NodeList nodeListRegistoAtribu = getChilds("atribuicao", element);
            for (int k = 0; k < nodeListRegistoAtribu.getLength(); k++) {
                NodeList nodeListFAE = getChilds("fae", (Element) nodeListRegistoAtribu.item(k));
                for (int i = 0; i < nodeListFAE.getLength(); i++) {
                    NodeList nodeListNomeFAE = getChilds("utilizador", (Element) nodeListFAE.item(i));
                    for (int l = 0; l < nodeListNomeFAE.getLength(); l++) {
                        u = getUtilizadorByUser(getUser(nodeListNomeFAE.item(l)));
                        atribuicao = new Atribuicao(getFAE(u), cand);
                    }
                }
            }

//            this.avaliarC.selectExposicao(registoExpo.obterIndexExposicao(criarExpo.getExposicao()));
//            this.avaliarC.selectCandidatura(criarExpo.getExposicao().getListaCandidaturas().getListaCandidaturas().indexOf(cand));
//            this.avaliarC = new AvaliarCandidaturaController(centroExpo);
//            this.avaliarC.novaAvaliacao();
//            this.avaliarC.setRespostas(conhecimentoFAE, adequacaoExposicao, adequacaoDemonstracao, adequacaoConvites, recomendacao);
//            this.avaliarC.registaAvaliacao();

        }

    }

    private Utilizador getUtilizadorByUser(String user) {
        return registoUtilizadoresController.getRegistoUtilizadores().getUtilizador(user);
    }

    private Date toDate(String tag, Element element) throws ParseException {
        String data = getTagValue(tag, element);
        String aux[] = data.split("-");
        String aux1[] = aux[2].split("T");
        Date date = format.parse(aux1[0] + "/" + aux[1] + "/" + aux[0]);
        return date;
    }

    private String getUser(Node item) {
        if (item.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) item;
            String user = getTagValue("username", element);
            return user;
        }
        return null;
    }

    private FAE getFAE(Utilizador u) {
        ListaFAE listaFAEs = FAEctrl.getListaFAE(criarExpo.getExposicao());
        ArrayList<FAE> listaFAE = listaFAEs.getListaFAE();
        for (FAE fae : listaFAE) {
            if (u.getUsername().equals(fae.getUtilizador().getUsername())) {
                return fae;
            }
        }
        return null;
    }

//    public boolean valida() {
//        List<Exposicao> listaExpo = this.centroExpo.getListaExposicao();
//        for (Exposicao e : listaExpo) {
//            if (!listaExpo.stream().noneMatch((exp) -> (e.getNome().equalsIgnoreCase(exp.getNome())))) {
//                return false;
//            }
//            List<Organizador> org = e.getListaOrganizadores().getListaOrganizadores();
//            if (org.size() < 2) {
//                return false;
//            }
//            List<FAE> fae = e.getListaFAE().getListaFAE();
//            if (fae.size() < 2) {
//                return false;
//            }
//            if (!org.stream().noneMatch((o) -> (!fae.stream().noneMatch((f) -> (f.getUtilizadorFAE().getEmail().equalsIgnoreCase(o.getUtilizadorOrganizador().getEmail())))))) {
//                return false;
//            }
//        }
//        List<Utilizador> listaUtilizadores = this.centroExpo.getRegistoUtilizadores().getListaUtilizadores();
//        return listaUtilizadores.stream().noneMatch((u) -> (!listaUtilizadores.stream().noneMatch((_item) -> (u.getEmail().equalsIgnoreCase(u.getEmail())))));
//    }
}
