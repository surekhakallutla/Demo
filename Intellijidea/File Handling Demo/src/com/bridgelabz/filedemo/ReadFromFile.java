package com.bridgelabz.filedemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        File myFile = new File("static/FirstFile.txt");
        if(myFile.exists()) {
            try {
                Scanner fileReader = new Scanner(myFile);
                while(fileReader.hasNextLine()) {
                    System.out.println(fileReader.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }
        }
    }
}
