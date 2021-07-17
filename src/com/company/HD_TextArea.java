/*
Zulker Nayeen
FH -11

this is hidh detailed textarea. will be created by high detailed design style
it's color & text size can be changed by user
 */

package com.company;

import javax.swing.*;
import java.awt.*;

public class HD_TextArea  extends UI_Component {
    JTextArea area = new JTextArea(); // create text area

    // construct the UI element
    public HD_TextArea(Component component)
    {
        int x  = component.getX();
        int y = component.getY();
        super.X = x;
        super.Y = y;
        super.text = component.getText();
        super.type = component.getType();
        // set default color & size
        super.textSize = 12;
        super.bgColor = new Color(255,255,0);
    }

    // add components to UI , java swing panel
    public void addToUI()
    {
        // set some value
        area.setFont(new Font("Arial", Font.PLAIN, super.textSize));
        area.setBorder(BorderFactory.createLineBorder(Color.green,5,true));
        area.setBackground(super.bgColor);
        area.setBounds(super.X,super.Y,100,50);
        area.setText(super.text);
        Window_manager.panel.add(area);
    }

    // change color
    public void changeColor(int r, int g, int b)
    {
        super.bgColor = new Color(r,g,b);
    }
}