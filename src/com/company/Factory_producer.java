/*
Zulker Nayeen
FH -11

this factory will produce which design style to be choosen.
called by window manager,
 */

package com.company;

public class Factory_producer {

    public static Abstract_UI_Factory getFactory(int choice) {
        if (choice == 1) {
            return new Simplistic_Design_Style();  // return simplistic design style

        } else if (choice == 2) {
            return new High_Detailed_Design_Style(); // return high detailed design style

        } else  {
            return new Default_Design_Style(); // return default design style

        }
    }
}
