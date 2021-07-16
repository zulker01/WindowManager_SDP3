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

    public  static JFrame frame = new JFrame("JFrame demo");  // creating the frame
    public static JPanel panel =  new JPanel(); // creating panel
    // creating the frame obj






    /*
    private Simplistic_Design_Style sim ;
    private boolean simbool;
    private boolean hdbool;
    private boolean defaultbool;
    private High_Detailed_Design_Style hd;
    private Default_Design_Style df;

     */
    private Component[] components= new Component[10];
    private Integer componentIndex=0;
    private Abstract_UI_Factory designStyle;

    // this class will initialize WM with appropriate choice
    public Window_manager(Integer choice)
    {
        // get the design style from appropriate class
        designStyle  = Factory_producer.getFactory(choice);
        /*
        if(choice==1)
        {
            sim = new Simplistic_Design_Style();
            simbool = true;

        }
        else if (choice==2)
        {
            hd = new High_Detailed_Design_Style();
            hdbool = true;
        }
        else if(choice==3)
        {
            df = new Default_Design_Style();
            defaultbool=true;
        }
        */

    }

    // this class will read the file one by one,
    // create & add every object in the desing style
    public void loadUI(Config_manager config){

        //loop untill there is item
        while(config.hasNextItem())
        {
            components[componentIndex] = config.nextItem(); // get next component

            System.out.println(components[componentIndex].getX()+" "+components[componentIndex].getY()+" "+components[componentIndex].getType()+" "+components[componentIndex].getText()+" ");

            designStyle.createComponent(components[componentIndex]); // create the component
            System.out.println(designStyle.ui_components[componentIndex].text);

            componentIndex+=1; // go to next index
        }
        config.closeFile(); // after reading ,close the file

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
