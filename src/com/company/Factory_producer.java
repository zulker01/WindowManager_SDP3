package com.company;

public class Factory_producer {

    public static Abstract_UI_Factory getFactory(int choice) {
        if (choice == 1) {
            return new Simplistic_Design_Style();

        } else if (choice == 2) {
            return new High_Detailed_Design_Style();

        } else  {
            return new Default_Design_Style();

        }
    }
}
