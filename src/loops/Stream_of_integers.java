package loops;

import java.util.Scanner;

public class Stream_of_integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int sum = 0;
        while (num != -1){
            sum = sum + num;
            num = sc.nextInt();
        }
        System.out.println(sum);
    }
}
