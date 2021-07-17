/*
Zulker Nayeen
FH -11

Default design style class, it will load whatever in the file & make the UI.
User will not be able to change anything

this is  a factory of UI element
 */

package com.company;

public class Default_Design_Style extends Abstract_UI_Factory{

    // create the component of file
    public void createComponent(Component component)
    {
        if(component.getType().equals("Button"))
        {
            // if button type , create button
            super.ui_components[super.componentIndex] = new Simplistic_Button(component);
            //System.out.println("button created ");
        }
        else if (component.getType().equals("TextArea"))
        {
            // if Text Area type , create TExt area
            super.ui_components[super.componentIndex] = new Simplistic_TextArea(component);
        }
        else if (component.getType().equals("TextField"))
        {
            // if TextField type , create textField
            super.ui_components[super.componentIndex] = new Simplistic_TextField(component);
        }
        super.componentIndex+=1;  // create next item
    }


    // nothing could be changed here
    @Override
    public void changeAttribute() {
        System.out.println("you cannot change anything here");
    }
}
