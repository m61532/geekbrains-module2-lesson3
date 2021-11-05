package ru.geekbrains.lesson3;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class UniqueWords {

    UniqueWords(String[] strings) {
        printUniqueList(strings);
        printWordRepetitions(strings);
    }

    private void printUniqueList(String[] strings) {
        System.out.println("Unique words:\n" + new LinkedHashSet<>(Arrays.asList(strings)) + "\n");
    }

    private void printWordRepetitions(String[] strings) {
        int counter = 0;
        System.out.printf("Words with repetitions quantity:\n");
        for (Object word : new LinkedHashSet(Arrays.asList(strings))) {
            for (String string : strings){
                if (string.equals(word)){
                    counter++;
                }
            }
            if (counter > 1) {
                System.out.println(word + "(" + counter + ")");
            }
            counter = 0;
        }
    }
}
