/** Class that allows converting XML to String and read/write to files. */
package lapr.project.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.StringWriter;
import java.util.Properties;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/** @author Nuno Bettencourt [NMB] on 29/05/16 && Grupo 18_LAPR2 15-16 */
// CLASSE NAO UTILIZADA
public class XMLParser {

    /**
     * This methods renders an XML Node to string ommiting the XML declarion on
     * top.
     *
     * @param document The XML Document to render.
     * @return A structured string for the XML Document.
     */
    public String convertToString(Document document) throws TransformerException {
        //Set transformer properties
        Properties transformerProperties = new Properties();
        transformerProperties.setProperty(OutputKeys.INDENT, "yes");

        //Render to XML
        return convertNodeToString(transformerProperties, document);
    }

    /**
     * This methods renders an XML Node to string ommiting the XML declarion on
     * top.
     *
     * @param node The XML node to render.
     * @return A structured string for the XML node.
     */
    public String convertToString(Node node) throws TransformerException {
        //Set transformer properties
        Properties transformerProperties = new Properties();
        transformerProperties.setProperty(OutputKeys.INDENT, "yes");
        transformerProperties.setProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");

        //Render to XML
        return convertNodeToString(transformerProperties, node);

    }

    /**
     * Renders an XML node to String.
     *
     * @param transformerProperties Transformer Properties to be applied to the
     * node.
     * @param node The XML node to transform to string.
     * @return A structured string for the XML node.
     */
    private String convertNodeToString(Properties transformerProperties, Node node) throws TransformerException {
        TransformerFactory tFact = TransformerFactory.newInstance();

        Transformer transformer = tFact.newTransformer();

        transformer.setOutputProperties(transformerProperties);
        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);
        DOMSource source = new DOMSource(node);

        transformer.transform(source, result);
        return writer.toString();
    }

    /**
     * Reads XML from a file and transforms it into an XML element.
     *
     * @param filename Filename to be read.
     * @return XML Node containing the file content
     * @throws Exception
     */
    public Node readXMLElementFromFile(String filename) throws Exception {
        File fXmlFile = new File(filename);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);

        doc.getDocumentElement().normalize();

        System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

        NodeList nListConfirmados = doc.getElementsByTagName("registoUtilizadoresConfirmados");

        System.out.println("----------------------------");

        for (int temp = 0; temp < nListConfirmados.getLength(); temp++) {
            Node nNodeConfirmados = nListConfirmados.item(temp);;
            NodeList nListUtilizadores = nNodeConfirmados.getChildNodes();

            for (int i = 0; i < nListUtilizadores.getLength(); i++) {

                Node nNode = nListUtilizadores.item(i);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    System.out.println("\nCurrent Element :" + nNodeConfirmados.getNodeName());
                    Element eElement = (Element) nNode;

                    System.out.println("Nome : " + eElement.getElementsByTagName("nome").item(0).getTextContent());
                    System.out.println("Email : " + eElement.getElementsByTagName("email").item(0).getTextContent());
                    System.out.println("Username : " + eElement.getElementsByTagName("username").item(0).getTextContent());
                    System.out.println("Password : " + eElement.getElementsByTagName("password").item(0).getTextContent());

                }
            }
        }

        NodeList nListNaoConfirmados = doc.getElementsByTagName("registoUtilizadoresNaoConfirmados");

        System.out.println("----------------------------");

        for (int temp = 0; temp < nListNaoConfirmados.getLength(); temp++) {
            Node nNodeNaoConfirmados = nListNaoConfirmados.item(temp);;
            NodeList nListUtilizadores = nNodeNaoConfirmados.getChildNodes();
            for (int i = 0; i < nListUtilizadores.getLength(); i++) {

                Node nNode = nListUtilizadores.item(i);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    System.out.println("\nCurrent Element :" + nNodeNaoConfirmados.getNodeName());
                    Element eElement = (Element) nNode;

                    System.out.println("Nome : " + eElement.getElementsByTagName("nome").item(0).getTextContent());
                    System.out.println("Email : " + eElement.getElementsByTagName("email").item(0).getTextContent());
                    System.out.println("Username : " + eElement.getElementsByTagName("username").item(0).getTextContent());
                    System.out.println("Password : " + eElement.getElementsByTagName("password").item(0).getTextContent());

                }
            }

        }

        NodeList nListaStands = doc.getElementsByTagName("stands");

        System.out.println("----------------------------");

        for (int temp = 0; temp < nListaStands.getLength(); temp++) {
            Node Stand = nListaStands.item(temp);;
            NodeList nListStand = Stand.getChildNodes();
            for (int i = 0; i < nListStand.getLength(); i++) {

                Node nNode = nListStand.item(i);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    System.out.println("\nCurrent Element :" + Stand.getNodeName());
                    Element eElement = (Element) nNode;

                    System.out.println("Descricao : " + eElement.getElementsByTagName("descricao").item(0).getTextContent());

                }
            }

        }

        NodeList nRegistoExposicoes = doc.getElementsByTagName("registoExposicoes");

        System.out.println("----------------------------");

        for (int temp = 0; temp < nRegistoExposicoes.getLength(); temp++) {
            System.out.println("------- NovaExposicao -------");

            Node Exposicao = nRegistoExposicoes.item(temp);
            NodeList nListDadosExposicao = Exposicao.getChildNodes();
            for (int i = 0; i < nListDadosExposicao.getLength(); i++) {

                Node nNode = nListDadosExposicao.item(i);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    System.out.println("\nCurrent Element :" + Exposicao.getNodeName());
                    Element eElement = (Element) nNode;

                    System.out.println("Titulo : " + eElement.getElementsByTagName("titulo").item(0).getTextContent());
                    System.out.println("Descricao : " + eElement.getElementsByTagName("descricao").item(0).getTextContent());
                    System.out.println("Data Inicio : " + eElement.getElementsByTagName("dataInicio").item(0).getTextContent());
                    System.out.println("Data Fim : " + eElement.getElementsByTagName("dataFim").item(0).getTextContent());
                    System.out.println("Sub Inicio : " + eElement.getElementsByTagName("subInicio").item(0).getTextContent());
                    System.out.println("Sub Fim : " + eElement.getElementsByTagName("subFim").item(0).getTextContent());
                    System.out.println("Data Limite Conflitos: " + eElement.getElementsByTagName("dataLimiteConflitos").item(0).getTextContent());
                    System.out.println("Local : " + eElement.getElementsByTagName("local").item(0).getTextContent());

                    System.out.println("\n \n Registo Organizadores : " + eElement.getElementsByTagName("registoOrganizadores").item(0).getTextContent());
                    System.out.println("\n \n Registo FAEs : " + eElement.getElementsByTagName("registoFAEs").item(0).getTextContent());
                    System.out.println("\n \n Registo Candidaturas : " + eElement.getElementsByTagName("registoCandidaturas").item(0).getTextContent());
                    System.out.println("\n \n Registo Atribuicoes : " + eElement.getElementsByTagName("registoAtribuicoes").item(0).getTextContent());
                }
            }

        }
        return doc.getDocumentElement();

    }

    /**
     * Writes an XML node to a file.
     *
     * @param node XML node to be written.
     * @param filename File to be written.
     * @throws Exception
     */
    public void writeXMLElementToFile(Node node, String filename) throws Exception {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
        DOMSource source = new DOMSource(node);

        StreamResult result = new StreamResult(new File(filename));

        transformer.transform(source, result);
    }

}