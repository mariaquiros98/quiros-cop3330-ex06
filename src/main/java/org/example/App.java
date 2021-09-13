/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Maria Quiros
 */

/*Declaring package*/
package org.example;

/*Importing classes*/
import java.util.Calendar;
import java.util.Scanner;

/*Specifying class*/
public class App {
    public static void main(String[] args) {

        /*Creating a scanner object*/
        Scanner scan = new Scanner(System.in);

        /*Initializing variables*/
        int currentAge;
        int retireAge;
        int yearsLeft;
        int retireYear;

        /*Obtaining current year*/
        Calendar cal = Calendar.getInstance();

        /*Prompting for current age*/
        System.out.println("What is your current age?");
        currentAge = scan.nextInt();

        /*Prompting for desired retirement age*/
        System.out.println("At what age would you like to retire?");
        retireAge = scan.nextInt();

        /*Calculating amount of years left until retirement*/
        yearsLeft = retireAge - currentAge;

        /*Calculating retirement year*/
        retireYear = cal.get(Calendar.YEAR) + yearsLeft;


        /*Displaying output of years left until retirement and what year that will be*/
        System.out.printf("You have %d years left until you can retire.\n", +yearsLeft);
        System.out.printf("It's %d, so you can retire in %d.", +cal.get(Calendar.YEAR), +retireYear );
    }
}



