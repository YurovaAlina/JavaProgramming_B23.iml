package day17_String;

import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        String sentence = "My favourite programming languages are: C#, Java, JavaScript";

        boolean hasPython = sentence.contains("Python");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.toLowerCase().contains("java");

        System.out.println("hasPython = " + hasPython); //false
        System.out.println("hasJava = " + hasJava); //true

        System.out.println("hasJava2 = " + hasJava2);

        System.out.println("---------------");

        String sentence2 = "Cybertek School is the best";

        boolean startsWithCybertek = sentence2.startsWith("Cybertek");//true
        boolean startsWithSchool = sentence2.startsWith("School");//false

        System.out.println("startsWithCybertek = " + startsWithCybertek);
        System.out.println("startsWithSchool = " + startsWithSchool);


    }
}