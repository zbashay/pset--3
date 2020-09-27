import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Height :");
        double heightin = in.nextDouble();

        System.out.println("Width :");
        double widthin = in.nextDouble();

        double heightcm = heightin * 2.54;
        double widthcm = widthin * 2.54;

        double perimeter = heightcm + heightcm + widthcm + widthcm;

        DecimalFormat commaFormat;
        commaFormat = new DecimalFormat("#,###.##");

        System.out.println(" ");
        System.out.println(commaFormat.format(perimeter) + " centimeters.");

        in.close();
    }
}