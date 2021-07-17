/*
Zulker Nayeen
FH -11

this is hidh detailed button. will be created by high detailed design style
it's color & text size can be changed by user
 */

package com.company;

import javax.swing.*;
import java.awt.*;

public class HD_Button extends UI_Component {
    JButton b = new JButton(); // create the button

    // contruct the button from component read fromfile
    public HD_Button(Component component) {
        int x = component.getX();
        int y = component.getY();
        super.X = x;
        super.Y = y;
        super.text = component.getText();
        super.type = component.getType();
        // set default color & size
        super.bgColor = new Color(255,255,0); // color int rgb : 0-7 bit : blue, 8-15 bit : green, 16-23bit : Red
        super.textSize = 12;
    }

    // add the button to UI, swing panel
    public void addToUI() {
       // b.setBorder(BorderFactory.createBevelBorder(0, Color.green, Color.orange, Color.red, Color.blue,)); //Four Colors Outer Bevel
        //b.setBorder(BorderFactory.createEtchedBorder(Color.green, Color.yellow));

        // setting the necessary attributes
        b.setFont(new Font("Arial", Font.PLAIN, super.textSize));
        b.setBorder(BorderFactory.createLineBorder(Color.green,5,true));
        b.setBackground(super.bgColor);
        b.setBounds(super.X, super.Y, 100, 50);
        b.setText(super.text);
        Window_manager.panel.add(b);
    }


    // changeing color, method
    public void changeColor(int r, int g, int b)
    {
        super.bgColor = new Color(r,g,b);

    }
}