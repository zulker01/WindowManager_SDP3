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
        config.read(path);
             Window_manager wm = new Window_manager(choice);
             wm.loadUI(config);


    }
}
