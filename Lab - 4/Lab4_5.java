import java.util.HashSet;
import java.util.Scanner;

public class Lab4_5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int[] uniqueArray = removeDuplicates(array);

        System.out.println("Array without duplicates: ");

        for (var n1 : uniqueArray) {
            System.out.print(n + " ");
        }

        sc.close();

    }

    public static int[] removeDuplicates(int[] array) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : array) {
            set.add(num);
        }

        int[] uniqueArray = new int[set.size()];
        int index = 0;

        for (int num : set) {
            uniqueArray[index] = num;
            index++;
        }

        // return array
        return uniqueArray;
    }
}