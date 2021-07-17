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
        super.textSize = 12;
        super.bgColor = new Color(255,255,0);

    }
    public void addToUI()
    {
        field.setFont(new Font("Arial", Font.PLAIN, super.textSize));
        field.setBorder(BorderFactory.createLineBorder(Color.blue,5,true));
        field.setBackground(super.bgColor);
        field.setBounds(super.X,super.Y,100,50);
        field.setText(super.text);
        Window_manager.panel.add(field);
    }

    public void changeColor(int r, int g, int b)
    {
        super.bgColor = new Color(r,g,b);
    }
}
