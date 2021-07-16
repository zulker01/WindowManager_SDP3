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

    }

    public void addToUI() {
       // b.setBorder(BorderFactory.createBevelBorder(0, Color.green, Color.orange, Color.red, Color.blue,)); //Four Colors Outer Bevel
        //b.setBorder(BorderFactory.createEtchedBorder(Color.green, Color.yellow));
        b.setBorder(BorderFactory.createLineBorder(Color.green,5,true));
        b.setBackground(Color.yellow);
        b.setBounds(super.X, super.Y, 100, 50);
        b.setText(super.text);
        Window_manager.panel.add(b);
    }
}