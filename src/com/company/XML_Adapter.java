/*
Zulker Nayeen
FH -11

this uses adaptor design pattern . Main config manager file could handle text file
this adaptor class is created to handle xml file
 */


package com.company;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;

public class XML_Adapter extends Config_manager{

    private XML_Perser xml = new XML_Perser() ; // xml perser will read file
    private NodeList nodeList;

    private int currentNode=0;

    // constructor
    public XML_Adapter(String type)
    {
        super(type);

    }

    // read the xml file
    @Override
    public void read(String path)
    {
        //System.out.println("in xml read");
        super.myObj = new File(path);
        nodeList = xml.parseXmlFile(super.myObj);
        //System.out.println(nodeList.getLength());
    }

    // check if there is next item
    @Override
    public  boolean hasNextItem()
    {
        if(currentNode==nodeList.getLength())
            return false;
        else
            return  true;
    }

    // get the next item as component object
    @Override
    public Component nextItem() {
        Node node = nodeList.item(currentNode);
        currentNode+=1;

        return xml.getItem(node);
    }

    // close file
    @Override
    public void closeFile()
    {

    }
}
