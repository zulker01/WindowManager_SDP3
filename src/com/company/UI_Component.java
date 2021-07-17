package com.company;

import java.awt.*;

public abstract class UI_Component {
    protected  int X;
    protected int Y;
    protected String text;
    protected String type;
    protected Color bgColor;
    protected int textSize;

    public abstract void addToUI();
    public abstract void  changeColor(int r, int g, int b);
}
