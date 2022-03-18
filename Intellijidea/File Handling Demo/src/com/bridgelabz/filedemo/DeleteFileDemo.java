package com.bridgelabz.filedemo;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {
        File myFile = new File("static/FirstFile.txt");
        System.out.println(myFile.delete());
    }
}
