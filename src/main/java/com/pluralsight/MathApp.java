package com.pluralsight;

public class MathApp {

    public static void main(String[] args) {
        /* Question 1: Create two variables to represent the salary for Bob and Gary, name them
bobSalary and garySalary. Create a new variable named
highestSalary. Determine whose salary is greater using Math.max() and
store the answer in highestSalary. Set the initial salary variables to any value
you want. Print the answer (i.e "The highest salary is ...") */

        double bobSalary = 900000.0;
        double garySalary = 870000.0;
        double highestSalary = Math.max(bobSalary,garySalary);
        // then code solution
        System.out.println("The highest salary is " + highestSalary);


        /* Question 2:Find and display the smallest of two variables named carPrice and
        truckPrice. Set the variables to any value you want.*/

        double carPrice = 45_000;
        double truckPrice = 70_000;
        double smallestPrice = Math.min(carPrice,truckPrice);

        System.out.println("The smallest price is " + smallestPrice);

        //Question 3: Find and display the area of a circle whose radius is 7.25

        double radius = 7.25;
        double area = Math.round(Math.PI * radius * radius);

        System.out.println("Area of the circle is" + " " + area);

        //Question 4: Find and display the square root of a variable after it is set to 5.0
         double setVariable = 5.0;
         double squareRoot = Math.sqrt(setVariable);

         System.out.println("The square root of a variable after it is set to 5.0 is" + " " + squareRoot);

        //Question 5: Find and display the distance between the points (5, 10) and (85, 50)

        //coordinates
        double x1 = 5;
        double y1 = 10;

        double x2 = 85;
        double y2 = 50;

        //distance

        double cx = x2 - x1;
        double cy = y2 - y1;
        double distanceOf = Math.sqrt(cx * cx + cy * cy);

        System.out.println("The distance between points is" + " " + distanceOf);

        //Question 6: Find and display the absolute (positive) value of a variable after it is set to -3.8
        double valueVar = -3.8;
        double absoluteValue = Math.abs(valueVar);

        System.out.println("The absolute value of a variable is" + " " +absoluteValue);

        //Question 7: Find and display a random number between 0 and 1
        double randomNumber = Math.random();

        System.out.println("A random number between 0 and 1 is: " + randomNumber);

        /* Question 8: Calculate how many minutes are in 24 days, use a variable for each value you
        calculate with. BONUS: How many milliseconds? */


        int minuteDay24 =  (60 * 24) * 24;

        System.out.println("There are 60 seconds in a minute and 60 minutes in an hour");
        System.out.println("There are" + " " + minuteDay24 + " " + "minutes in 24 days");

        int millisecondsToHour = 60_000 * 60;
        int milliToDay24 = (millisecondsToHour * 24) * 24;

        System.out.println("There are" + " " + milliToDay24 + " " + "milliseconds in 24 days");


    }

}
