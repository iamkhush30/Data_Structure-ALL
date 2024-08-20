import java.util.Scanner;

public class Lab3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of pattern : ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + " ");
            }
            System.out.println();
        }

    }

    public static int pascal(int i, int j) {
        return factorial(i) / (factorial(i - j) * factorial(j));
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = num; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }

}