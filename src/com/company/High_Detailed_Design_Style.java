/*
Zulker Nayeen
FH -11

this is hidh detailed design style, its a factory method which creates the UI elements

those elements can be changed by color & text size
 */

package com.company;

import java.util.Scanner;

public class High_Detailed_Design_Style extends Abstract_UI_Factory{

    // create the component of file
    public void createComponent(Component component)
    {
        if(component.getType().equals("Button"))
        {
            // create button
            super.ui_components[super.componentIndex] = new HD_Button(component);
            //System.out.println("button created ");
        }
        else if (component.getType().equals("TextArea"))
        {
            // create txt area
            super.ui_components[super.componentIndex] = new HD_TextArea(component);
        }
        else if (component.getType().equals("TextField"))
        {
            // crreate text field
            super.ui_components[super.componentIndex] = new HD_TextField(component);
        }
        super.componentIndex+=1;  // increase the index , for adding next element
    }

    // method to let user change attribute
    public void changeAttribute() {
        Scanner scanner1 = new Scanner(System.in);

        // loop untill user changes items
        while (true) {
            // ask if user want to change anything or not
            System.out.println("Change anything ? \n1.Change\n2.Exit");
            int choice = scanner1.nextInt();
            if(choice==1) {
                // which element he wants to change
                System.out.println("Which element want to change ?\nEnter Element no : ");
                int changeIndex = scanner1.nextInt(); // index of the changeable element

                // clarify by the item user want to change
                System.out.println("change " + ui_components[changeIndex].type + " " + changeIndex + "\n1.Color\n2. textSize ");
                choice = scanner1.nextInt();
                if(choice==1)
                {
                    // change color by RGB, enter red value, green value , blue value
                    System.out.print("red : ");
                    int r = scanner1.nextInt();
                    System.out.print("Green : ");
                    int g = scanner1.nextInt();
                    System.out.print("Blue : ");
                    int b = scanner1.nextInt();

                    // change the color
                    ui_components[changeIndex].changeColor(r,g,b);
                }
                else if(choice==2)
                {
                    // change the text size
                    System.out.println("Enter TextSize : ");
                    int txtSize = scanner1.nextInt();
                    ui_components[changeIndex].textSize = txtSize;
                }

            }
            // back & create the UI
            else
            {
                break;
            }
        }
    }
}
