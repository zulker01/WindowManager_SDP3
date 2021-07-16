package com.company;

import javax.swing.*;

public class Window_manager {
    public static JPanel panel;
    JButton[] buttons = new JButton[10];
    public static JFrame frame;
    String data="";
    private Simplistic_Design_Style sim ;
    private boolean simbool;
    private boolean hdbool;
    private boolean defaultbool;
    private High_Detailed_Design_Style hd;
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
            defaultbool=true;
        }
    }
    public void loadUI(Config_manager config){

        while(config.hasNextItem())
        {
            components[componentIndex] = config.nextItem();
            componentIndex+=1;
            System.out.println(components[0].getX()+" "+components[0].getY()+" "+components[0].getType()+" "+components[0].getText()+" ");
        }
        config.closeFile();

    }
}
