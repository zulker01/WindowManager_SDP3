/*
Zulker Nayeen
FH -11

This abstract class is a factory class, will be extended by HIGH detailed design style,
Simplistic Design style, Default design style.

any of the three will be created on the runtime by the user
 */


package com.company;

public abstract class Abstract_UI_Factory {

    // components arraylist of the UI
    public  UI_Component[] ui_components  = new UI_Component[10];
    public  int componentIndex = 0;  // initial component index = 0

    // this method will create appropriate components , button, text area etc
    public abstract void createComponent(Component component);
    // this method will take user input to change the attribute of the component
    public abstract  void changeAttribute();



    }

