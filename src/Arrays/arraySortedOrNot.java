package Arrays;

import java.util.Scanner;

public class arraySortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int s = sc.nextInt();

        int [] arr = new int[s];
        System.out.println("Enter " +s+" elements :  ");
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(check(arr));
    }
    public static boolean check(int []arr){
        boolean ch = true;
        for (int i = 1; i<arr.length; i++){
            if ( arr[i] < arr[i-1] ){
                ch = false;
            }
        }
        return ch;
    }
}
