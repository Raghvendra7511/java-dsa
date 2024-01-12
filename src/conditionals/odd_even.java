package conditionals;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if (n%2==0)
            System.out.println("Number is even : ");
        else
            System.out.println("Number is odd");
    }
}
