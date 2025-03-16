import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are doing area of triangle\n");
        System.out.print("Please enter your base in cms: ");
        double base = input.nextDouble();
        System.out.print("please enter your height in cms: ");
        double height = input.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("The area of your triangle is: " + area +"cms2");




    }
}
