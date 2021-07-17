package com.company;

public abstract class Abstract_UI_Factory {
    public  UI_Component[] ui_components  = new UI_Component[10];
    public  int componentIndex = 0;

    public abstract void createComponent(Component component);
    public abstract  void changeAttribute();



    }

