package Exercises.Collections;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> namesList = new ArrayList<>();
        List<String> namesList2 = new ArrayList<>();
        String name1 = "Ion";

        namesList.add("Alex");
        namesList.add("Andrei");
        namesList.add("Mihai");
        namesList.add("Alina");
        namesList.add("Ioana");

        namesList2.add("Alex");
        namesList2.add("Andrei");
        namesList2.add("Mihai");
        namesList2.add("Andrei");
        namesList2.add("Ioana");


        System.out.println(namesList);
        System.out.println(namesList.hashCode());
        System.out.println(namesList.equals(namesList2));

        namesList.remove(2);

        System.out.println(namesList);

        namesList.remove("Ioana");

        System.out.println(namesList);











    }
}
