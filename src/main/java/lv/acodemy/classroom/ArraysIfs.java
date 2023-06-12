package lv.acodemy.classroom;

import java.util.Arrays;

public class ArraysIfs {
    public static void main(String[] args) {

        //Array

        int[] numbers = {1, 4, 7, 8, 10, 15, 40, 57};

//        System.out.println(numbers[9]); - has exeption - out of bounds


        int[] ages = new int[10];
        ages[0] = 18;
        ages[3] = 24;

        System.out.println(Arrays.toString(ages));
        System.out.println(ages);


        //String array

        String[] names = {"John", "Andrew", "Mary", "Angelica"};
        System.out.println(Arrays.toString(names));
        System.out.println(names[3]);


        //Logical Statements

        if (5 < 10) {
            System.out.println("Yes, this is correct");
        }

        boolean isSummer = true;
        if (isSummer) {
            System.out.println("Yes, it's summer and its quite hot in here");
        }

        int x = 10;
        if (x < 30) {
            System.out.println("Number is positive" + x);
        }

        if (x > 0) {
            System.out.println("Number is negative" + x);
        }

        if (x % 2 == 0) {
            System.out.println("This number can be divided");
        }


        /*
        if(true) {
        do smth if true
        } else {
        do smth if false
        }
         */


        if (x > 0) {
            System.out.println("Number is positive:");
        } else {
            System.out.println("Number is negative:");
        }


        if (x % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        if (x < 18) {
            System.out.println("Person is not eligible for voting");
        } else {
            System.out.println("Person can go vote");
        }


        isSummer = false;
        boolean isWinter = false;
        boolean isAutumn = false;

        if (isSummer) {
            System.out.println("Right, this is summer");
        } else if (isWinter) {
            System.out.println("Right, this is winter");
        } else if (isAutumn) {
            System.out.println("Right, this is autumn");
        } else {
            System.out.println("Not sure, but it san be spring");
        }


        int grade = 7;
        if (grade == 1) {
            System.out.println("Unsatisfacotry");
        } else if (grade == 2) {
            System.out.println("Unsatisfactory");
        } else if (grade == 3) {
            System.out.println("Unsatisfactory");
        } else if (grade == 4) {
            System.out.println("Almost satisfactory");
        } else if (grade == 5) {
            System.out.println("Satisfactory");
        } else if (grade == 6) {
            System.out.println("Almost good");
        } else if (grade == 7) {
            System.out.println("Good");
        } else if (grade == 8) {
            System.out.println("Very good");
        } else if (grade == 9) {
            System.out.println("Excellent");
        } else if (grade == 10) {
            System.out.println("Perfecto");
        } else {
            System.out.println("Incorrect grade provided");
        }


        int angle = 120;
        if (angle > 0 && angle == 90) {
            System.out.println("Acute angle");
        } else if (angle == 90) {
            System.out.println("Right angle");
        } else if (angle > 90 && angle < 180) {
            System.out.println("Obtuse angle");
        } else if (angle == 180) {
            System.out.println("Straight angle");
        } else {
            System.out.println("Provided angle is incorrect");
        }


        int[] numberArray = {5, 7, 10};

        int max;

        if (numberArray[0] > numberArray[1]) {
            max = numberArray[0];
        } else if (numberArray[0] > numberArray[2]) {
            max = numberArray[0];
        }


    }
}
