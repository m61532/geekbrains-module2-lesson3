package ru.geekbrains.lesson3;

import java.util.HashMap;

public class PhoneBook {
    HashMap<String, String> phoneBook = new HashMap<>();

    public void add(String name, String number) {
        phoneBook.put(name, number);
    }

    public void get(String name) {
        if (phoneBook.containsKey(name)) {
            System.out.println(phoneBook.get(name));
        }
    }
}
