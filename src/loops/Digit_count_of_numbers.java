package loops;

import java.util.Scanner;

public class Digit_count_of_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        long n = sc.nextLong();
        long numOfDidits = 0;
        long Original_n = n;
        while (Original_n>0){
            Original_n = Original_n/10;
            numOfDidits++;
        }
        System.out.println("Number of digits in " +n+" = "+numOfDidits);
    }
}
