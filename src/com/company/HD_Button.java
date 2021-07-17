package com.company;

import javax.swing.*;
import java.awt.*;

public class HD_Button extends UI_Component {
    JButton b = new JButton();

    public HD_Button(Component component) {
        int x = component.getX();
        int y = component.getY();
        super.X = x;
        super.Y = y;
        super.text = component.getText();
        super.type = component.getType();
        super.bgColor = new Color(255,255,0); // color int rgb : 0-7 bit : blue, 8-15 bit : green, 16-23bit : Red
        super.textSize = 12;
    }

    public void addToUI() {
       // b.setBorder(BorderFactory.createBevelBorder(0, Color.green, Color.orange, Color.red, Color.blue,)); //Four Colors Outer Bevel
        //b.setBorder(BorderFactory.createEtchedBorder(Color.green, Color.yellow));
        b.setFont(new Font("Arial", Font.PLAIN, super.textSize));
        b.setBorder(BorderFactory.createLineBorder(Color.green,5,true));
        b.setBackground(super.bgColor);
        b.setBounds(super.X, super.Y, 100, 50);
        b.setText(super.text);
        Window_manager.panel.add(b);
    }

    public void changeColor(int r, int g, int b)
    {
        super.bgColor = new Color(r,g,b);

    }
}