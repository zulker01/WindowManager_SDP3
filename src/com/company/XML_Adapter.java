package com.company;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;

public class XML_Adapter extends Config_manager{

    private XML_Perser xml = new XML_Perser() ;
    private NodeList nodeList;

    private int currentNode=0;
    public XML_Adapter(String type)
    {
        super(type);

    }

    @Override
    public void read(String path)
    {
        System.out.println("in xml read");
        super.myObj = new File(path);
        nodeList = xml.parseXmlFile(super.myObj);
        System.out.println(nodeList.getLength());
    }

    @Override
    public  boolean hasNextItem()
    {
        if(currentNode==nodeList.getLength())
            return false;
        else
            return  true;
    }

    @Override
    public Component nextItem() {
        Node node = nodeList.item(currentNode);
        currentNode+=1;

        return xml.getItem(node);
    }
    @Override
    public void closeFile()
    {

    }
}
