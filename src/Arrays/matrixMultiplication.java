package Arrays;

import java.util.Scanner;

public class matrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns of matrix_1: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int [][] M1 = new int[r1][c1];
        System.out.println("Enter "+r1*c1+ " elements for matrix M1: ");
        for (int i = 0; i<r1; i++){
            for (int j = 0; j<c1; j++){
                M1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter rows and columns matrix_2: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if (c1 != r2){
            System.out.println("Matrix dimensions do not match for multiplication.");
            return;
        }

        int [][] M2 = new int[r2][c2];
        System.out.println("Enter "+r2*c2+" elements for matrix M2: ");
        for (int i = 0; i<r2; i++){
            for (int j = 0; j<c2; j++){
                M2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        printMatrix(M1);

        System.out.println("Matrix 2");
        printMatrix(M2);

        System.out.println("Multiplication of matrix_1 and matrix_2 is:");
        multiplication(M1,r1,c1,M2,r2,c2);

    }
    static void multiplication(int [][]M1, int r1, int c1, int [][]M2, int r2, int c2){
        if (c1 != r2){
            System.out.println("Matrix dimensions do not match for multiplication.");
            return;
        }
        int [][] ans = new int[r1][c2];
        for (int i = 0; i<r1; i++){
           for (int j = 0; j<c2; j++){
               for (int k = 0; k<c1; k++){
                   ans[i][j] += (M1[i][k] * M2[k][j]);
               }
           }
        }
        printMatrix(ans);

    }
    static void printMatrix(int [][]matrix){
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
