/*
**************************************************
* Zulker Nayeen
* FH - 11
*
* window manager class will create necessary design class from user choice,
* then it will read the file , through config.nextItem , then add the buttons/ textarea/other components
* in the design style, after creating their objects
*
* lastly will show the objects through java swing JFrame
 */


package com.company;

import javax.swing.*;

public class Window_manager {

    public  static JFrame frame = new JFrame("Zulker Nayeen - 11");  // creating the frame
    public static JPanel panel =  new JPanel(); // creating panel
    // creating the frame obj

    // component array of UI elements
    private Component[] components= new Component[10];
    private Integer componentIndex=0; // index
    private Abstract_UI_Factory designStyle; // UI design style

    // static window manager class, this is example of singleton pattern,
    // only one object will be used throughout the whole program
    private static Window_manager wm = new Window_manager();

    // if any class wants to word the window manager class

    public static Window_manager getInstance()
    {
        return wm;
    }

    // create the design style according to user choise
    public void initializeDesignStyle(Integer choice)
    {
        designStyle  = Factory_producer.getFactory(choice);
    }

    // private constructor, no one can use it to create any mor window manager
    private Window_manager(){}



    // this class will read the file one by one,
    // create & add every object in the desing style
    public void loadUI(Config_manager config){

        //loop untill there is item
        while(config.hasNextItem())
        {
            components[componentIndex] = config.nextItem(); // get next component

            //System.out.println(components[componentIndex].getX()+" "+components[componentIndex].getY()+" "+components[componentIndex].getType()+" "+components[componentIndex].getText()+" ");

            designStyle.createComponent(components[componentIndex]); // create the component
            //System.out.println(designStyle.ui_components[componentIndex].text);

            componentIndex+=1; // go to next index
        }
        config.closeFile(); // after reading ,close the file
        designStyle.changeAttribute(); // change attribute from taking the user

    }

    // this will initialize the JFRAAM
    public void initializeFram()
    {
        // add panel in Jframe
        frame.add(panel);


        panel.setLayout(null); // absolute layout


    }


    // this will show the final UI
    public void startUI()
    {
            // loop through every components & add them in UI
            for(int i=0;i<componentIndex;i++)
            {
                designStyle.ui_components[i].addToUI();
            }


        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // how app ends
        frame.setSize(500,1000); // set the height width of frame
        //frame.pack(); // this will create window for the size of inside things
        frame.setVisible(true); // turn on frame
    }
}
