package src;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Homework 1 : ");
        double homework1 = in.nextDouble();

        System.out.print("Homework 2 : ");
        double homework2 = in.nextDouble();

        System.out.print("Homework 3 : ");
        double homework3 = in.nextDouble();

        System.out.print("Quiz 1     : ");
        double quiz1 = in.nextDouble();

        System.out.print("Quiz 2     : ");
        double quiz2 = in.nextDouble();

        System.out.print("Test 1     : ");
        double test1 = in.nextDouble();

        double homeworkavg = (homework1 + homework2 + homework3)/3;

        double quizavg = (quiz1 + quiz2)/2;

        double testavg = test1;

        double finalgrade = (homeworkavg * .15) + (quizavg * .35) + (testavg * .5);

        String strDouble = String.format("%.2f", finalgrade);

        System.out.println(" ");
        System.out.println((strDouble) + "%");

        in.close();
    }
}