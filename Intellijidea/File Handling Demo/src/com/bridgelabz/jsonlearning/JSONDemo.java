package com.bridgelabz.jsonlearning;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JSONDemo {
    public static void main(String[] args) {
        HashMap<String, String> myMap = new HashMap<>();

       List<Long> contact = new ArrayList<>();
       contact.add(9059903113);
       contact.add(9959977267);
       contact.add(9951815357);

        JSONObject homeAddress = new JSONObject();
        homeAddress.put("no.", 30);
        homeAddress.put("Society", "PQR");
        JSONObject officeAddress = new JSONObject();
        officeAddress.put("no.", 30);
        officeAddress.put("Society", "PQR");

        JSONObject address = new JSONObject();
        address.put("homeAddress", homeAddress);
        address.put("officeAddress", officeAddress);

        JSONObject obj = new JSONObject();
        obj.put("name" , "ABC");
        obj.put("isAdmin", true);
        obj.put("fees", 100.38);
        obj.put("null", null);
        System.out.println(obj);
//to save the JSON file into the file and save
        try {
            FileWriter fr = new FileWriter(ststic / newJSONFile.json);) {
            fr.write(obj.toJSONString());
            fr.flush();
            fr.close();
        } catch(IOException e) {
            System.out.println(e);
        }

    }
}
