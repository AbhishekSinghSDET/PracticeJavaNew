package com.api.serialization;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GSON_Runner {

    //Will be using GSON library to convert java object to json format
    public static void main(String[] args) {
        Person p = new Person("Abhishek");
        System.out.println(p);

        Gson gson = new Gson();
        String data = gson.toJson(p);  // need to store in String variable so that proper json format is shown
        System.out.println(data);

        System.out.println("-------------Convert json into pretty format--------------");
        //Convert json into pretty format
        Gson gsonPretty = new GsonBuilder().setPrettyPrinting().create();
        String formattedData = gsonPretty.toJson(p);
        System.out.println(formattedData);
    }
}
