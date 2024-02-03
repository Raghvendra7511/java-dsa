package Arrays;

import java.util.Scanner;

public class non_DecreasingArrayType_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int s = sc.nextInt();
        int [] arr = new int[s];
        System.out.println("Enter "+s+" element : ");
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(checkPossibility(arr));
    }
    static boolean checkPossibility(int []arr){
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n-1; i++){
            if (arr[i] > arr[i+1]){
                count++;
                if (count > 1){
                    return false;
                }
                if (i > 0 && (arr[i-1] > arr[i+1])){
                    arr[i+1] = arr[i];
                }

            }
        }
        return true;
    }
}
