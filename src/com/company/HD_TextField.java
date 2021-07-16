package com.company;

import javax.swing.*;
import java.awt.*;

public class HD_TextField extends UI_Component {
    JTextField field = new JTextField();
    public HD_TextField(Component component)
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
        field.setBorder(BorderFactory.createLineBorder(Color.blue,5,true));
        field.setBackground(Color.yellow);
        field.setBounds(super.X,super.Y,100,50);
        field.setText(super.text);
        Window_manager.panel.add(field);
    }

}
