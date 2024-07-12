package xml_study;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Xml_example {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try{
            // XML 파싱
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new File("xml/Sample.xml"));

            Element element = doc.getDocumentElement();
            System.out.println("Node : " + element.getNodeName());
            System.out.println("ost : " + element.getAttribute("ost"));
            NodeList nodeList = element.getChildNodes();
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element name = (Element)node;
                    if(name.getNodeName().equals("name")){
                       System.out.println(name.getNodeName() + " : " + name.getTextContent());
                    }
                }

            }

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
/*
    Node : OSTList
    ost : Ghibli
    name : 마녀 배달부 키키
*/