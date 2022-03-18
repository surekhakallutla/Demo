package com.bridgelabz.jsonlearning;

import jdk.nashorn.internal.parser.JSONParser;
import org.json.simple.JSONObject;

import java.io.FileReader;
import java.text.ParseException;

class Student {
    String name;
    Double fees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }
}

public class ReadFromJSON {
    static Student stud = new Student();

    public static void main(String[] args) {
        try { FileReader fr = new FileReader("static/newJSONFile.json");) {
            Object obj = new JSONParser().parse(fr);
            JSONObject jObj = (JSONObject) obj;
            stud.setName((String) jObj.get("name"));
            System.out.println(name);
            stud.setFees((Double) jObj.get("fees"));
            System.out.println(fees);
        } catch (ParseException e) {
            System.out.prntln(e);
        }


        }

    }
}
