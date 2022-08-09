package Exercises.Ex2;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] names = {"isuf.muca@crystal-system.eu",
                "\n danjel.halili@crystal-system.eu",
                "\n flavio.lorenci@crystal-system.eu",
                "\n elia.omeri@crystal-system.eu",
                "\n ardit.elezi@crystal-system.eu",
                "\n luka.buziu@crystal-system.eu",
                "\n megi.lala@crystal-system.eu",
                "\n irena.shahini@crystal-system.eu",
                "\n indrit.vaka@crystal-system.eu",
                "\n griselda.muci@crystal-system.eu",
                "\n theodor.gheorghe@crystal-system.eu",
                "\n ioan.cocianu@crystal-system.eu",
                "\n teofil.mitrea@crystal-system.eu",
                "\n eduard.tiutiu@crystal-system.eu",
                "\n george.dobrota@crystal-system.eu",
                "\n stefanita.plesa@crystal-system.eu",
                "\n adrian-nicolae.tigau@crystal-system.eu",
                "\n emanuel.grabovschi@crystal-system.eu",
                "\n george.sirbu@crystal-system.eu",
                "\n andrei.state@crystal-system.eu",
                "\n florin-adrian.dumitru@crystal-system.eu",
                "\n victor.hincu@crystal-system.eu"};

        int option;
        Scanner scanner = new Scanner(System.in);
        Random randomName = new Random();
        int nr = randomName.nextInt(names.length);

        System.out.println("Hello! Please choose an option:\n1.Display all names 2.Choose a random name");
        option = scanner.nextInt();


//        System.out.println(Arrays.toString(names));
//        Random rand = new Random();
//        int nr = rand.nextInt(names.length);
//        System.out.println(names[nr]);


        do {

            if (option == 0)
                break;
            else if (option == 1) {
                System.out.println(Arrays.toString(names));
                break;
            } else if (option == 2) {
                System.out.println(names[nr]);
                break;
            } else if (option > 2) {
                System.out.println("Option number is not valid!");
                option = scanner.nextInt();
            }
        } while (option != 0);

    }
}




