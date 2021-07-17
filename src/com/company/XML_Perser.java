/*
Zulker Nayeen
FH -11

this class uses java DOM parser method to read XML file
this class reads file, reads each object & create components

 */


package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XML_Perser{


    // this will make the xml file ready to read, DOM perser method
    public NodeList parseXmlFile(File file)
    {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//an instance of builder to parse the specified xml file
        DocumentBuilder db = null;
        try {
            db = dbf.newDocumentBuilder();
            //System.out.println("error");
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        Document doc = null;
        try {
            doc = db.parse(file);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        doc.getDocumentElement().normalize();
        //System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
        NodeList nodeList = doc.getElementsByTagName("Component");
        return nodeList;
    }

    // get the component in the xml file
    public Component getItem(Node node)
    {
        Component component = new Component("");
        //System.out.println("\nNode Name :" + node.getNodeName());
        if (node.getNodeType() == Node.ELEMENT_NODE)
        {
            // create element & set fields of component
            Element eElement = (Element) node;
             component.setType(eElement.getElementsByTagName("Type").item(0).getTextContent());
            component.setText(eElement.getElementsByTagName("Text").item(0).getTextContent());
            component.setX(Integer.parseInt(eElement.getElementsByTagName("X").item(0).getTextContent()));
            component.setY(Integer.parseInt(eElement.getElementsByTagName("Y").item(0).getTextContent()));
            /*
            System.out.println("Component Type: "+ eElement.getElementsByTagName("Type").item(0).getTextContent());
            System.out.println("text in it  "+ eElement.getElementsByTagName("Text").item(0).getTextContent());
            System.out.println("x position  "+ eElement.getElementsByTagName("X").item(0).getTextContent());
            System.out.println("y position"+ eElement.getElementsByTagName("Y").item(0).getTextContent());


             */
        }
        return component;
    }
}
