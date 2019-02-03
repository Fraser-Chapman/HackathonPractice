package com.manchesterdigital.hackathonpractice;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class FileConverter {

    public void readXmlFromFile(String filePath) {
        //https://www.youtube.com/watch?v=2JH5YeQ68H8
        try {
            File xmlDoc = new File(filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = dbFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(xmlDoc);

            NodeList nodeList = document.getElementsByTagName("CarPark");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                System.out.println(node.getNodeName() + ": " + i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println(element.getElementsByTagName("CarParkName").item(0).getTextContent());
                }
            }

        } catch (Exception e) {
            System.out.println("fuck");
        }

    }
}
