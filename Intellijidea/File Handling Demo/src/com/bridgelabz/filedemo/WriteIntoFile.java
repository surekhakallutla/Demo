package com.bridgelabz.filedemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {
    public static void main(String[] args) {
        File myFile = new File("static/FirstFile.txt");
        //first create new file
        try {
            FileWriter fr = new FileWriter("static/FirstFile.txt");
            fr.write("This is my Java batch 100. \n Welcome to Java Bridgelabz");
            System.out.println("Writing in file is Successful");
            fr.flush();
            fr.close();
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
