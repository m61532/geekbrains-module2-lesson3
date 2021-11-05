package ru.geekbrains.lesson3;

public class Main {
    public static void main(String[] args) {
        String[] stringsArray = {"1","2","3","4","5","6","7","8","9","10",
                                 "1","12","13","4","4","6","17","18","19","20"};

        new UniqueWords(stringsArray);

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Имя1", "Номер1");
        phoneBook.add("Имя2", "Номер2");
        phoneBook.add("Имя3", "Номер3");
        phoneBook.add("Имя4", "Номер4");

        System.out.println();
        phoneBook.get("Имя3");
        phoneBook.get("Имя1");
    }
}
