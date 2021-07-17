/*
Zulker Nayeen
FH-11
This is component class, after reading the file, each type of UI elements will be binded to component
object. Each UI element in the file ,will create a component, which will be added by the design style
by creating UI element objects


 */

package com.company;

public class Component {
    private String type="";  // UI element type
    private String text=""; // text in it
    private String color=""; // color of UI
    private int X; // x coordinate
    private int Y; // y coordinate

    // constructor
    public Component(String type)
    {
        this.type =   type;
    }

    // getter & setter methods
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }
}
