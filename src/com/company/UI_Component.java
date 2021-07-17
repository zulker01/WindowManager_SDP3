/*
Zulker Nayeen
FH -11

UI component class, inherited by all UI elements, as all have more or less same type of fields
extra fields could be added distinctly by the element
 */


package com.company;

import java.awt.*;

public abstract class UI_Component {
    //variables
    protected  int X;
    protected int Y;
    protected String text;
    protected String type;
    protected Color bgColor;
    protected int textSize;

    //  methods to be implemented by element classes
    public abstract void addToUI();
    public abstract void  changeColor(int r, int g, int b);
}
