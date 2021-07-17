/*
Zulker Nayeen
FH -11

this is button created by simplistic design style
 */


package com.company;

import javax.swing.*;
import java.awt.*;

public class Simplistic_Button extends UI_Component {
    JButton b = new JButton(); // create the button
    public Simplistic_Button(Component component)
    {
        int x  = component.getX();
        int y = component.getY();
        super.X = x;
        super.Y = y;
        super.text = component.getText();
        super.type = component.getType();
        super.bgColor = new Color(51,255,255);


    }

    // add the button to java swing panel
    public void addToUI()
    {
        b.setBackground(super.bgColor);
        b.setBounds(super.X,super.Y,100,50);
        b.setText(super.text);
        Window_manager.panel.add(b);
    }

    // change color
    public void changeColor(int r, int g, int b)
    {
        super.bgColor = new Color(r,g,b);
    }

}
