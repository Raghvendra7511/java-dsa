package Basics;

import java.util.Scanner;

public class square_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int x = sc.nextInt();
        int sq = x * x;
        System.out.println("Square of number is : " + sq);
    }
}
