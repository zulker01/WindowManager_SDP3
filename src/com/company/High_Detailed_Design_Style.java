package com.company;

import java.util.Scanner;

public class High_Detailed_Design_Style extends Abstract_UI_Factory{

    // create the component of file
    public void createComponent(Component component)
    {
        if(component.getType().equals("Button"))
        {
            super.ui_components[super.componentIndex] = new HD_Button(component);
            System.out.println("button created ");
        }
        else if (component.getType().equals("TextArea"))
        {
            super.ui_components[super.componentIndex] = new HD_TextArea(component);
        }
        else if (component.getType().equals("TextField"))
        {
            super.ui_components[super.componentIndex] = new HD_TextField(component);
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
                int changeIndex = scanner1.nextInt();
                System.out.println("change " + ui_components[changeIndex].type + " " + changeIndex + " text");
                String newText = scanner1.next();
                ui_components[changeIndex].text = newText;
            }
            else
            {
                break;
            }
        }
    }
}
