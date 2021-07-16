package com.company;

public class Default_Design_Style extends Abstract_UI_Factory{

    // create the component of file
    public void createComponent(Component component)
    {
        if(component.getType().equals("Button"))
        {
            super.ui_components[super.componentIndex] = new Simplistic_Button(component);
            System.out.println("button created ");
        }
        else if (component.getType().equals("TextArea"))
        {
            super.ui_components[super.componentIndex] = new Simplistic_TextArea(component);
        }
        else if (component.getType().equals("TextField"))
        {
            super.ui_components[super.componentIndex] = new Simplistic_TextField(component);
        }
        super.componentIndex+=1;
    }

    @Override
    public void changeAttribute() {
        System.out.println("you cannot change anything here");
    }
}
