/*
Zulker Nayeen
FH -11

This is main class , which will use user choice, then get a single window manager instance
use of singeleton design pattern , window manager will handle the rest


 */


package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in); // scanner to take in put
        Config_manager config; // config manager object
        int choice;

        // what file will be loaded
        System.out.println("**** Welcome ******\n");
        System.out.println("take input from : \n1.text file\n2.xml file");

        // take input for text or xml
        choice = scanner.nextInt();
        // path for both text & xml
        String pathTxt ="E://intellij project//sdpAss3//src//com//company//config.txt";
        String pathXML ="E://intellij project//sdpAss3//src//com//company//config2.xml";
        if(choice==1) {

            config = new Config_manager("text"); // config file loads text
            config.read(pathTxt); // read text file
        }
        else {
            config = new XML_Adapter("xml"); // config file loads xml
            config.read(pathXML); // read xml file
        }

        // which design style to be choosen
        System.out.println("Select Design Style : \n1.Simplistic Design\n2.High detailed Design\n3.Default");
        choice = scanner.nextInt();

        // take input for text or xml



        Window_manager wm = Window_manager.getInstance(); // get window manager instane
        wm.initializeDesignStyle(choice); // select design style
        wm.initializeFram(); // initialize the frame ( java swing frame )
        wm.loadUI(config); // load from file, the objects , create objects
        wm.startUI(); // show the objects added from the file


    }
}
