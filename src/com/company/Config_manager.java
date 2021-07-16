package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import  java.util.*;

public class Config_manager {

    private File myObj;
    private Scanner myReader;
    private boolean xml;
    private  boolean text;
    public Config_manager(String type)
    {
        if(type.equals("text"))
        {
            xml = true;
        }
        else if(type.equals("xml"))
        {
            text = true;
        }

    }
    public void read(String path) {
         myObj = new File(path);   // read the file in file object
        {
            try {
                myReader = new Scanner(myObj); // open file in scanner class
            } catch (FileNotFoundException e) { // catch exception if file not found
                e.printStackTrace();
            }
        }
    }

    public Component nextItem()
    {
        // for text file
        String data = "";
        data = myReader.nextLine(); // load each line in data
        System.out.println(data);
        String[] itemList = data.split("-"); // load attributes in arralist
        String[] item = itemList[0].split(":") ;// first attribute button or anything else
        Component component = new Component(itemList[0]); // create component , itemList[0] = button

        for(int i=0;i< itemList.length;i++)
        {
             item = itemList[i].split(":") ;// single attribute
            if(item[0].equals("Color"))
            {
                component.setColor(item[1]);
            }
            else if(item[0].equals("Text"))
            {
                component.setText(item[1]);
            }
            else if(item[0].equals("X"))
            {
                int x = Integer.parseInt(item[1]);
                component.setX(x);
            }
            else if(item[0].equals("Y"))
            {
                int y = Integer.parseInt(item[1]);
                component.setY(y);
            }

        }
        return component;
    }
    public boolean hasNextItem()
    {
        return myReader.hasNextLine();
    }
    public void closeFile()
    {
        myReader.close();
    }
}

