package loops;

import java.util.Scanner;

public class First_Multiple_of_any_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no : ");
        int x = sc.nextInt();
        System.out.println("Enter second no : ");
        int y = sc.nextInt();
        for (int num = 1; true; num++){
            if (num%x == 0 && num%y == 0){
                System.out.println("Ans : "+num);
                break;
            }
        }
    }
}
