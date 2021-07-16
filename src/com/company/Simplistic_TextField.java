package com.company;

import javax.swing.*;

public class Simplistic_TextField extends UI_Component {
    JTextField field = new JTextField();
    public Simplistic_TextField(Component component)
    {
        int x  = component.getX();
        int y = component.getY();
        super.X = x;
        super.Y = y;
        super.text = component.getText();

    }
    public void addToUI()
    {
        field.setBounds(super.X,super.Y,100,50);
        field.setText(super.text);
        Window_manager.panel.add(field);
    }

}
