/*
Zulker Nayeen
FH -11

this is simplistic design style, its a factory method which creates the UI elements

those elements can be changed by color only
 */


package com.company;

import java.util.Scanner;

public class Simplistic_Design_Style extends Abstract_UI_Factory{

    // create the component of file
    int changeIndex;
    public void createComponent(Component component)
    {
        if(component.getType().equals("Button"))
        {
            // create button
            super.ui_components[super.componentIndex] = new Simplistic_Button(component);
            //System.out.println("button created ");
        }
        else if (component.getType().equals("TextArea"))
        {
            // create text area
            super.ui_components[super.componentIndex] = new Simplistic_TextArea(component);
        }
        else if (component.getType().equals("TextField"))
        {
            // create text filed
            super.ui_components[super.componentIndex] = new Simplistic_TextField(component);
        }
        super.componentIndex+=1; // increase the index
    }

    // change attributes
    public void changeAttribute() {
        Scanner scanner1 = new Scanner(System.in);
        // let user change till he wants, then create the UI
        while (true) {
            // if the user want to change anything
            System.out.println("Change anything ? \n1.Change\n2.Exit");
            int choice = scanner1.nextInt();
            if(choice==1) {

                // which element user want to change
                System.out.println("Which element want to change ?\nEnter Element no : ");
                changeIndex = scanner1.nextInt(); // index of the changeable element
                //scanner1.nextLine();
                // clarify element to be changed
                System.out.println("change " + ui_components[changeIndex].type + " " + changeIndex + " Color :\nEnter RGB value : ");
                // change the color
                System.out.print("red : ");
                int r = scanner1.nextInt();
                System.out.print("Green : ");
                int g = scanner1.nextInt();
                System.out.print("Blue : ");
                int b = scanner1.nextInt();

                ui_components[changeIndex].changeColor(r,g,b);
            }
            else
            {
                break;
            }
        }
    }

}
