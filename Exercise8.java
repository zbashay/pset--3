import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Students : ");
        double students = in.nextDouble();

        System.out.println("Teachers : ");
        double teachers = in.nextDouble();

        System.out.println("Capacity : ");
        double capacity = in.nextDouble();

        double passengers = students + teachers;
        double overflow = passengers % capacity;

        double buses = ((passengers - overflow) / capacity) + 1;

        String string1 = String.format("%.0f", buses);
        String string2 = String.format("%.0f", overflow);

        System.out.println(" ");
        System.out.println("Buses required      : " + string1);
        System.out.println("Overflow passengers : " + string2);

        in.close();
    }
}