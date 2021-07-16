package com.company;

import java.util.Scanner;

public class Simplistic_Design_Style extends Abstract_UI_Factory{

    // create the component of file
    int changeIndex;
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

    public void changeAttribute() {
        Scanner scanner1 = new Scanner(System.in);
        while (true) {
            System.out.println("Change anything ? \n1.Change\n2.Exit");
            int choice = scanner1.nextInt();
            if(choice==1) {
                System.out.println("Which element want to change ?\nEnter Element no : ");
                changeIndex = scanner1.nextInt();
                scanner1.nextLine();
                System.out.println("change " + ui_components[changeIndex].type + " " + changeIndex + " text");
                String newText = scanner1.nextLine();
                ui_components[changeIndex].text = newText;
                System.out.println( ui_components[changeIndex].text);
            }
            else
            {
                break;
            }
        }
    }

}
