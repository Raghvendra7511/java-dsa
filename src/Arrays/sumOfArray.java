package Arrays;

import java.util.Scanner;

public class sumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of an array : ");
        int l = sc.nextInt();

        int [] arr = new int[l];
        for (int i = 0; i<l; i++){
             arr[i] = sc.nextInt();
        }
        System.out.println("Total sum is : "+calculateSum(arr , l));

    }
    static int calculateSum(int []arr,int l ){
        int sum = 0;
        for (int i = 0; i<l ; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}
