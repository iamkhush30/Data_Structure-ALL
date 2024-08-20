
import java.util.Scanner;

public class Lab6_4 {

    public static double celsiusToFahrenhit(double celsius) {
        double fahrenhit;
        fahrenhit = (9.0 / 5.0) * celsius + 32;
        return fahrenhit;
    }

     public static double fahrenhitToCelsius(double fahrenhit) {
        double celsius;
        celsius = (5.0 / 9.0) * (fahrenhit - 32);
        return celsius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter temperature : ");
        double temperature = sc.nextDouble();

       System.out.println("Enter 1 for celsius to fehrenhit \nEnter 2 for fehrenhit to celsius :");
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println(temperature + " celsius = " + celsiusToFahrenhit(temperature) + " fehrenhit");
        } else if (n == 2) {
            System.out.println(temperature + " fehrenhit = " + fahrenhitToCelsius(temperature) + " celsius");
        } else {
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}