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

    }
    public void addToUI()
    {
        area.setBorder(BorderFactory.createLineBorder(Color.green,5,true));
        area.setBackground(Color.yellow);
        area.setBounds(super.X,super.Y,100,50);
        area.setText(super.text);
        Window_manager.panel.add(area);
    }

}