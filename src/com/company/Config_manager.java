/*
Zulker Nayeen
FH-11

This is the config manager class, which was demanded in the assignment 3 question
it is responsible for handling file, it handles txt file all by itself.
reads file & creates components objects & return them

to read xml file, this class is being inherited by XML_adapter class .
xml files are handled there .
 */


package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import  java.util.*;

public class Config_manager {

    protected File myObj; // file type object
    protected Scanner myReader; // scanner class, will read file
    protected boolean xml; // if file type xml
    protected   boolean text; // if file type text

    // constructor, if xml file , or text file mode
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

    // read the file
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

    // get next component in the file
    public Component nextItem()
    {
        // for text file
        String data = "";
        data = myReader.nextLine(); // load each line in data
        //System.out.println(data);
        String[] itemList = data.split("-"); // load attributes in arralist
        String[] item = itemList[0].split(":") ;// first attribute button or anything else
        Component component = new Component(itemList[0]); // create component , itemList[0] = button

        // loop through all attributes of the UI element, & add to component obj
        for(int i=0;i< itemList.length;i++)
        {
             item = itemList[i].split(":") ;// single attribute
            if(item[0].equals("Color"))  // if attribute is color
            {
                component.setColor(item[1]);
            }
            else if(item[0].equals("Text"))  // if attribute is text
            {
                component.setText(item[1]);
            }
            else if(item[0].equals("X"))  // if attribute is X cooordinate
            {
                int x = Integer.parseInt(item[1]);
                component.setX(x);
            }
            else if(item[0].equals("Y")) // if attribute is Y coordinate
            {
                int y = Integer.parseInt(item[1]);
                component.setY(y);
            }

        }
        return component;
    }

    // if the file has more item next
    public boolean hasNextItem()
    {
        return myReader.hasNextLine();
    }
    // close the file afterwars
    public void closeFile()
    {
        myReader.close();
    }
}

