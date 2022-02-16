package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Activity {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number :");
        int number1= scanner.nextInt();
        System.out.println("Input second number :");
        int number2 =scanner.nextInt();
        scanner.nextLine();

        System.out.println("your numbers are : " +number1+ " "+ "and "+ " "+number2);
        System.out.println("Pow of numbers is : " +Math.pow(number1,number2));
        System.out.println("Smallest value is :"+ Math.min(number1,number2));

        System.out.println("Please input a string: ");
        String string = scanner.nextLine();
        int len = string.length();
        String upString = string.toUpperCase(Locale.ROOT);
        System.out.println("Length of your string is: " + len);
        System.out.println("Your string in uppercase: " + upString);

        System.out.println("Please input one double number?");
        double dobuleNum = scanner.nextDouble();
        float floatNum = (float)dobuleNum;
        System.out.println("Number before Cast variable is "+dobuleNum+",\nand after cast number to float" +
                " number is "+floatNum);

    }

}
