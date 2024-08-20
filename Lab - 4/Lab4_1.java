
import java.util.Scanner;

public class Lab4_1 {

    static int[] arr;

    public static void insertAtPosition(int position, int element) {

        if (position >= arr.length)
            return;

        int[] finalArr = new int[arr.length + 1];

        for (int i = 0; i < position; i++) {
            finalArr[i] = arr[i];
        }

        finalArr[position] = element;

        for (int i = position + 1; i < finalArr.length; i++) {
            finalArr[i] = arr[i - 1];
        }

        arr = finalArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of an array : ");
        int n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Enter position :");
        int position = sc.nextInt();

        System.out.println("Enter element :");
        int element = sc.nextInt();

        insertAtPosition(position, element);

        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}