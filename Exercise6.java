import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Wage :");
        double wage = in.nextDouble();

        System.out.println("Monday :");
        double monday = in.nextDouble();

        System.out.println("Tuesday :");
        double tuesday = in.nextDouble();

        System.out.println("Wednesday :");
        double wednesday = in.nextDouble();

        System.out.println("Thursday :");
        double thursday = in.nextDouble();

        System.out.println("Friday :");
        double friday = in.nextDouble();

        System.out.println("Saturday :");
        double saturday = in.nextDouble();

        System.out.println("Sunday :");
        double sunday = in.nextDouble();

        double grosspay = (monday * wage) + (tuesday * wage) + (wednesday * wage) + (thursday * wage) + (friday * wage) + (saturday * wage) + (sunday * wage);

        String strDouble = String.format("%.2f", grosspay);

        System.out.println(" ");
        System.out.println("$" + (strDouble + "."));

        in.close();
    }
}