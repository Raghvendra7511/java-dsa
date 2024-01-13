package conditionals;

import java.util.Scanner;

public class greatest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int first = sc.nextInt();
        System.out.println("Enter second number : ");
        int second = sc.nextInt();
        System.out.println("Enter third number : ");
        int third = sc.nextInt();

        if (first>second && first>third){
            System.out.println("Greatest number is : "+ first);
        }
        else if (second>first && second>third){
            System.out.println("Greatest number is : "+ second);
        }
        else
            System.out.println("Greatest number is : "+ third);

    }
}
