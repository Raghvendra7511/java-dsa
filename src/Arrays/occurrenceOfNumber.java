package Arrays;

import java.util.Scanner;

public class occurrenceOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int l = sc.nextInt();
        int [] arr = new int[l];

        System.out.println("Enter the "+ l +" elements:");
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter X : ");
        int x = sc.nextInt();
        System.out.println("Total count of X is :"+countOccurrence(arr, x));

    }
    static int countOccurrence(int []arr, int x){
        int count = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]==x){
                count++;
            }
        }
        return count;
    }
}
