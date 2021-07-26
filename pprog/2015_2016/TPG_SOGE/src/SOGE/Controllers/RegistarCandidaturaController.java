package SOGE.Controllers;

import SOGE.Candidatura;
import SOGE.CentroExposicoes;
import SOGE.Demonstracao;
import SOGE.Exposicao;
import SOGE.Produto;
import SOGE.RegistoExposicoes;
import java.util.List;

/**
 * @author Débora Costa (1150433), João Borges (1150475) e Luís Gouveia
 * (1150437) @ LEI-ISEP
 */
public class RegistarCandidaturaController {

    /**
     * O centro de exposições no qual contém a exposicão a que se vai proceder ao registo de candidatura.
     */
    private CentroExposicoes centroExposicoes;
    
    /**
     * A exposição selecionada pelo utilizador, para a qual será feita uma candidatura.
     */
    private Exposicao exposicao;
    
    /**
     * A candidatura a ser criada e registada.
     */
    private Candidatura candidatura;

    /**
     * Cria instâncias da classe RegistarCandidaturaController com parâmetros.
     *
     * @param centroExposicoes o centro de exposicoes que contém a informação
     * necessaria para proceder ao registo da candidatura.
     */
    public RegistarCandidaturaController(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;

    }
    /**
     * Devolve uma lista com as exposições disponiveis no centro de exposições.
     * @return a lista de exposições
     */
    public List<Exposicao> getExposicoes(){
        RegistoExposicoes re = centroExposicoes.getRegistoExposicoes();
        return re.getExposicoes();
    }
    
    /**
     * Cria uma nova candidatura vazia, a ser preenchida
     * @param e a exposição para qual está a ser feita a candidatura.
     * @return a nova candidatura criada.
     */
    public Candidatura novaCandidatura(Exposicao e){
        this.exposicao = e;
        this.candidatura = e.novaCandidatura();
        return candidatura;
    }
    
    /**
     * Define os dados da Candidatura.
     * @param nomeEmpresa o nome da Empresa que está a efatuar a candidatura.
     * @param morada a morada da empresa
     * @param contacto o contacto telefónico
     * @param area a área de exposição pretendida
     * @param nConvites o número de Convites para a exposição pretendidos
     */
    public void setDados(String nomeEmpresa, String morada, int contacto, int area, int nConvites){
        candidatura.setNome(nomeEmpresa);
        candidatura.setMorada(morada);
        candidatura.setContacto(contacto);
        candidatura.setAreaPretendida(area);
        candidatura.setNumeroConvites(nConvites);
    }
    
    /**
     * Adiciona um produto a ser exposto á candidatura. 
     * @param designacao a designação do produto.
     * @return depois de ser criado é procedido de uma validação que, caso o produto nao passe na validação, 
     * envia um boolean para depois informar o utilizador da falha.
     */
    public boolean addProduto(String designacao){
        Produto p = candidatura.novoProduto();
        if(candidatura.adicionaProduto(p) == false){
            return false;
        }else{
            return true;
        }
    }
    
    /**
     * Devolve a lista de Demonstrações da Exposição
     * @return a lista de demonstrações disponíveis para seleção.
     */
    public List<Demonstracao> getListaDemonstracoes(){
        return exposicao.getListaDemonstracoes();
    }
    
    /**
     * Define as demonstrações requeridas pelo representante para a candidatura
     * @param ld a lista das demonstrações selecionadas
     */
    public void setListaDemonstracoes(List<Demonstracao> ld){
        candidatura.setListaDemonstracoes(ld);
    }
    
    /**
     * Valida localmente e golbalmente, e regista a candidatura na exposição
     * @return o resultado da valicação e registo.
     */
    public boolean registaCandidatura(){
       if(exposicao.validaCandidatura(candidatura) == true){
           exposicao.addCandidatura(candidatura);
           return true;
       } else{
           return false;
       }
    }

}
