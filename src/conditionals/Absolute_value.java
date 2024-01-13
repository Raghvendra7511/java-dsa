package conditionals;

import java.util.Scanner;

public class Absolute_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer : ");
        int x = sc.nextInt();
        if (x<0){
            x = x*-1;
            System.out.println("The absolute value of "+ -x + " is "+ x);
        }
        else
            System.out.println("The absolute value of "+ x + " is "+ x);
        }

    }

