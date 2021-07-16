package com.company;

import javax.swing.*;

public class Window_manager {

    public  static JFrame frame = new JFrame("JFrame demo");
    public static JPanel panel =  new JPanel();
    // creating the frame obj



    JButton[] buttons = new JButton[10];

    String data="";
    private Simplistic_Design_Style sim ;
    private boolean simbool;
    private boolean hdbool;
    private boolean defaultbool;
    private High_Detailed_Design_Style hd;
    private Default_Design_Style df;
    private Component[] components= new Component[10];
    private Integer componentIndex=0;

    public Window_manager(Integer choice)
    {
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
    }
    public void loadUI(Config_manager config){

        while(config.hasNextItem())
        {
            components[componentIndex] = config.nextItem();

            System.out.println(components[componentIndex].getX()+" "+components[componentIndex].getY()+" "+components[componentIndex].getType()+" "+components[componentIndex].getText()+" ");
            if(defaultbool)
            {
                df.createComponent(components[componentIndex]);
            }
            componentIndex+=1;
        }
        config.closeFile();

    }

    public void initializeFram()
    {
        // add panel in Jframe
        frame.add(panel);


        panel.setLayout(null); // absolute layout

    }

    public void startUI()
    {
        if(defaultbool)
        {
            for(int i=0;i<componentIndex;i++)
            {
                df.ui_components[i].addToUI();
            }
        }

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // how app ends
        frame.setSize(500,1000); // set the height width of frame
        //frame.pack(); // this will create window for the size of inside things
        frame.setVisible(true); // turn on frame
    }
}
