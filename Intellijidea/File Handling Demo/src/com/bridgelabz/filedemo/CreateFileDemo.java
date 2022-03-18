package com.bridgelabz.filedemo;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
    public static void main(String[] args) {
        File myFile = new File("static/FirstFile.txt");
        try {
            if(myFile.createNewFile())
                System.out.println("File Created!!");
            else {
                System.out.println("Name :" + myFile.getName());
                System.out.println("Total Space :" + myFile.getTotalSpace());
                System.out.println("Path :" + myFile.getPath());
                System.out.println("Absolute :" + myFile.getAbsoluteFile());
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
