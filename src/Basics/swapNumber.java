package Basics;

import java.util.Scanner;

public class swapNumber {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter x : ");
    int x = sc.nextInt();
    System.out.println("Enter y : ");
    int y = sc.nextInt();

    swap(x,y);
}
    static void swap(int x, int y){
        System.out.println("Value before swap");
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("Value after swap");
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
    }
}
