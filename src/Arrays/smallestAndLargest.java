package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class smallestAndLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int l = sc.nextInt();

        int [] arr = new int[l];
        System.out.println("Enter "+l+" elements : ");
        for (int i = 0 ; i< arr.length; i++){
            arr[i] = sc.nextInt();

        }
//        int[] ans = findSmallestAndLargestNumber(arr);
//        System.out.println("Smallest is : "+ans[0]);
//        System.out.println("Largest is : "+ans[1]);
        System.out.println(Arrays.toString(findSmallestAndLargestNumber((arr))));

    }
    static int[] findSmallestAndLargestNumber(int []arr){
        Arrays.sort(arr);
        int [] ans = {arr[0],arr[arr.length-1]};
        return ans;
    }
}
