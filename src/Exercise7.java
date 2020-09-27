
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Salary  :");
        double salary = in.nextDouble();

        System.out.println("401(k)  :");
        double fourohone = in.nextDouble();

        System.out.println("Federal :");
        double federal = in.nextDouble();

        System.out.println("State   :");
        double state = in.nextDouble();

        double posttax = (salary * ((100 - fourohone) / 100));

        double takehome = posttax - (posttax * (federal / 100)) - (posttax * (state / 100));

        double paycheck = takehome / 24;

        DecimalFormat commaFormat;
        commaFormat = new DecimalFormat("#,###.##");

        System.out.println(" ");
        System.out.println("$" + (commaFormat.format(paycheck)) + ".");

        in.close();
    }
}
