package com.company;

import javax.swing.*;
import java.awt.*;

public class HD_TextArea  extends UI_Component {
    JTextArea area = new JTextArea();
    public HD_TextArea(Component component)
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
        area.setFont(new Font("Arial", Font.PLAIN, super.textSize));
        area.setBorder(BorderFactory.createLineBorder(Color.green,5,true));
        area.setBackground(super.bgColor);
        area.setBounds(super.X,super.Y,100,50);
        area.setText(super.text);
        Window_manager.panel.add(area);
    }

    public void changeColor(int r, int g, int b)
    {
        super.bgColor = new Color(r,g,b);
    }
}