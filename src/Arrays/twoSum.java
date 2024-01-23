package Arrays;

import java.util.Scanner;

public class twoSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int s = sc.nextInt();

        int [] arr = new int[s];
        System.out.println("Enter "+s+" element : ");

        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter target sum : ");
        int target = sc.nextInt();
        System.out.println("Pair = "+pairSum(arr,target));
    }

    static int pairSum(int []arr , int target) {
        int ans = 0;
        for (int i = 0; i<arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if (arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }
}
