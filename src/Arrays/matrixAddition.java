package Arrays;

import java.util.Scanner;

public class matrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns for Matrix_1 :");
        System.out.print("Enter no. of rows = ");
        int r1 = sc.nextInt();
        System.out.print("Enter no. of columns = ");
        int c1 = sc.nextInt();

        int [][] M1 = new int[r1][c1];
        System.out.println("Enter "+r1*c1+ " elements for matrix M1 : ");
        for (int i = 0; i<r1; i++){
            for (int j = 0; j<c1; j++){
                M1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number of rows and columns for matrix_2 : ");
        System.out.print("Enter no. of rows = ");
        int r2 = sc.nextInt();
        System.out.print("Enter no. of columns = ");
        int c2 = sc.nextInt();

        if (r1 != r2 || c1 != c2){
            System.out.println("Matrix dimensions do not match for addition.");
            return;
        }

        int [][] M2 = new int[r2][c2];
        System.out.println("Enter "+r2*c2+" elements for matrix M2 : ");
        for (int i = 0; i<r2; i++){
            for (int j = 0; j<c2; j++){
                M2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        printMatrix(M1);

        System.out.println("Matrix 2");
        printMatrix(M2);

        System.out.println("Sum of matrix_1 and matrix_2 is: ");
        addition(M1,r1,c1,M2,r2,c2);
    }
    static void addition(int [][]M1, int r1, int c1, int [][]M2, int r2, int c2){
        if (r1 != r2 || c1 != c2){
            System.out.println("Matrix dimensions do not match for addition.");
            return;
        }
        int [][]ans = new int[r1][c1];
        for (int i = 0; i<r1; i++){
            for (int j = 0; j<c1; j++){
                ans[i][j] = M1[i][j] + M2[i][j];
            }
        }
        printMatrix(ans);
    }
    static void printMatrix(int [][]arr){
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
