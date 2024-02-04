package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class rangeQueryPrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int s = sc.nextInt();

        int [] arr = new int[s+1];
        System.out.print("Enter "+s+ " element : ");
        for (int i=1; i<=arr.length-1; i++){
            arr[i] = sc.nextInt();
        }

        int [] prefix = prefixSumInPlace(arr);
//        System.out.println(Arrays.toString(prefix));

        System.out.print("Enter no. of Queries : " );
        int q = sc.nextInt();

        while (q-- > 0){
            System.out.println("Enter range from : ");
            System.out.print("l = ");
            int l = sc.nextInt();
            System.out.print("r = ");
            int r = sc.nextInt();
            System.out.println("Sum of range = " + (prefix[r] - prefix[l-1]));
        }
    }
    static int[] prefixSumInPlace(int []arr){
        for (int i = 1; i<arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
}
