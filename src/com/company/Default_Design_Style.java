package com.company;

public class Default_Design_Style {

    public UI_Component[] ui_components = new UI_Component[10];
    public int componentIndex=0;
    public void createComponent(Component component)
    {
        if(component.getType().equals("Button"))
        {
            ui_components[componentIndex] = new Simplistic_Button(component);
        }
        else if (component.getType().equals("TextArea"))
        {
            ui_components[componentIndex] = new Simplistic_TextArea(component);
        }
        else if (component.getType().equals("TextField"))
        {
            ui_components[componentIndex] = new Simplistic_TextField(component);
        }
        componentIndex+=1;
    }
}
