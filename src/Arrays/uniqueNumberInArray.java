package Arrays;

import java.util.Scanner;

public class uniqueNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int s = sc.nextInt();

        int [] arr = new int[s];
        System.out.println("Enter "+s+" element :");
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Unique number = "+uniqueNumber(arr));
    }
    static int uniqueNumber(int []arr){
        int ans = -1;
        for (int i=0; i<arr.length; i++){
            for (int j= i+1; j<arr.length; j++){
                if (arr[i]==arr[j]){
                    arr[i] = ans;
                    arr[j] = ans;
                }
            }
        }
        for (int i = 0; i<arr.length; i++){
            if (arr[i]>0){
                ans = arr[i];
            }
        }
        return ans;
    }
}
