package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Can you please tell us your name?");
        String name = scanner.nextLine();
        System.out.println("Aha, nice to meet you, " + name);

        System.out.println("What is your gender?");
        char gender = scanner.next().charAt(0);
        System.out.println(gender);

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("You are " + age);

        System.out.println("What is your number?");
        long number = scanner.nextLong();
        System.out.println("I will call you on " + number);

        System.out.println("What was your GPA at faculty?");
        double gpa = scanner.nextDouble();
        System.out.println("Your GPA was " + gpa);

        System.out.println("Are you happy?");
        boolean isHappy = scanner.nextBoolean();
        System.out.println("You are happy. (" + isHappy + ")");

   }

}
