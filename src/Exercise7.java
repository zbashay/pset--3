package src;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Salary  : ");
        double salary = in.nextDouble();

        System.out.print("401(k)  : ");
        double fourohonekay = in.nextDouble();

        System.out.print("Federal : ");
        double federal = in.nextDouble();

        System.out.print("State   : ");
        double state = in.nextDouble();

        double posttax = (salary * ((100 - fourohonekay) / 100));

        double takehome = posttax - (posttax * (federal / 100)) - (posttax * (state / 100));

        double paycheck = takehome / 24;

        DecimalFormat commaFormat;
        commaFormat = new DecimalFormat("#,###.##");

        System.out.println(" ");
        System.out.println("$" + (commaFormat.format(paycheck)) + ".");

        in.close();
    }
}
