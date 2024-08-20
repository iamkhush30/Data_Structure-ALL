
import java.util.Scanner;

public class Lab5_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter row of Frist matrices : ");
        int r1 = sc.nextInt();
        System.out.print("enter column of Frist matrices : ");
        int c1 = sc.nextInt();
        int[][] matrix1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print("enter element of FRIST matrix : [" + i + "][" + j + "] : ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i < r1 ; i++){
            for(int j = 0 ; j < c1 ; j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }


        System.out.print("enter row of Second matrices : ");
        int r2 = sc.nextInt();
        System.out.print("enter column of Second matrices : ");
        int c2 = sc.nextInt();
        int[][] matrix2 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print("enter element of  SECOND matrix [" + i + "][" + j + "] : ");
                matrix2[i][j] = sc.nextInt();
            }
        }


        for(int i = 0 ; i < r2 ; i++){
            for(int j = 0 ; j < c2 ; j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }


        int[][] MaltiplicationOfMatrix = new int[r1][c2];

        if (c1 != r2) {
            System.out.println("enter valid row and column");
        } else {
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    MaltiplicationOfMatrix[i][j] = 0;
                    for (int k = 0; k < c1; k++) {
                        MaltiplicationOfMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
        }

        System.out.println("Multiplication of two matrix is : ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(MaltiplicationOfMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}