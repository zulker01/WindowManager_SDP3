package com.company;

import javax.swing.*;

public class Simplistic_TextArea extends UI_Component {
    JTextArea area = new JTextArea();
    public Simplistic_TextArea(Component component)
    {
        int x  = component.getX();
        int y = component.getY();
        super.X = x;
        super.Y = y;
        super.text = component.getText();

    }
    public void addToUI()
    {
        area.setBounds(super.X,super.Y,100,50);
        area.setText(super.text);
        Window_manager.panel.add(area);
    }

}