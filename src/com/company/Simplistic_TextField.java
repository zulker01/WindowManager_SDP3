/*
Zulker Nayeen
FH -11

this is text field created by simplistic design style
 */


package com.company;

import javax.swing.*;
import java.awt.*;

public class Simplistic_TextField extends UI_Component {
    JTextField field = new JTextField(); // create the text field

    // constructor
    public Simplistic_TextField(Component component)
    {
        int x  = component.getX();
        int y = component.getY();
        super.X = x;
        super.Y = y;
        super.text = component.getText();
        super.type = component.getType();
        super.bgColor = new Color(51,255,255);

    }

    // add to UI, java swing panel
    public void addToUI()
    {
        field.setBackground(super.bgColor);
        field.setBackground(super.bgColor);
        field.setBounds(super.X,super.Y,100,50);
        field.setText(super.text);
        Window_manager.panel.add(field);
    }

    // change color
    public void changeColor(int r, int g, int b)
    {
        super.bgColor = new Color(r,g,b);
    }
}
