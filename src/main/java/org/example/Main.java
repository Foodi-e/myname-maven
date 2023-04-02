package org.example;

import com.google.gson.Gson;


public class Main {
    public static void main(String[] args) {
        String firstName = "Volodia";
        String lastName = "Vovchko";

        NameObject nameObject = new NameObject(firstName, lastName);
        Gson gson = new Gson();
        String json = gson.toJson(nameObject);

        System.out.println(json);
    }

    static class NameObject {
        private final String name;
        private final String lastName;

        public NameObject(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }
    }
}