package Basics;

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount : ");
        float P = sc.nextFloat();
        System.out.println("Enter the rate of interest : ");
        float R = sc.nextFloat();
        System.out.println("Enter the time period : ");
        float T = sc.nextFloat();
        float SI = (P * R * T) / 100;
        System.out.println("Simple interest is : " + SI);
    }
}
