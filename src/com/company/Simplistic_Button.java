package com.company;

import javax.swing.*;

public class Simplistic_Button extends UI_Component {
    JButton b = new JButton();
    public Simplistic_Button(Component component)
    {
        int x  = component.getX();
        int y = component.getY();
        super.X = x;
        super.Y = y;
        super.text = component.getText();
        super.type = component.getType();

    }
    public void addToUI()
    {
        b.setBounds(super.X,super.Y,100,50);
        b.setText(super.text);
        Window_manager.panel.add(b);
    }

}
