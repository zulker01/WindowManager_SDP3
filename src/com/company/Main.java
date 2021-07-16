/*
Zulker Nayeen
FH -11

This is main class , which will use user choice, then create a single window manager
use of singeleton design pattern , window manager will handle the rest


 */


package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Config_manager config;


        System.out.println("**** Welcome ******");
        System.out.println("take input from : \n1.text file\n2.xml file");
        /*
        // take input for text or xml
        int choice = scanner.nextInt();
        String path ="E://intellij project//sdpAss3//src//com//company//config.txt";
        if(choice==1) {

            config = new Config_manager("text"); // config file loads text
            config.read(path);
        }
        else {
            config = new Config_manager("xml"); // config file loads xml
            config.read(path);
        }

        System.out.println("Select Design Style : \n1.Simplistic Design\n2.High detailed Design\n3.Default");

        // take input for text or xml
         choice = scanner.nextInt();
*/
        int choice = 3;
        config = new Config_manager("text"); // config file loads text
        String path ="E://intellij project//sdpAss3//src//com//company//config.txt";
        config.read(path); // read the file , create necessary file read objects
             Window_manager wm = new Window_manager(choice); // create window manager
             wm.initializeFram(); // initialize the frame ( java swing frame )
             wm.loadUI(config); // load from file, the objects , create objects
             wm.startUI(); // show the objects added from the file


    }
}
