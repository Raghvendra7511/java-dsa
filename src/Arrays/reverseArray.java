package Arrays;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int [] arr = {2,5,4,4,50,8,9};
        System.out.println("Arrays before reversed : "+Arrays.toString((arr)));
        System.out.print("Arrays  after reversed : ");
        inPlaceReverse(arr);
//        System.out.println("Arrays  after reversed : "+Arrays.toString(reverse(arr)));
    }
    static int[] reverse(int []arr){
        int n = arr.length;
        int [] ans = new int[n];
        int j = 0;
        for (int i = n-1; i>=0; i--){
            ans[j] = arr[i];
            j++;
        }
        return ans;

    }
    static void inPlaceReverse(int []arr){
        int n = arr.length;
        int j = n-1;


//        while (i<j){
//            swapArray(arr,i,j);
//            i++;
//            j--;
//        }

        for (int  i=0; i<j; i++) {
            arr[i] = arr[i]+arr[j];
            arr[j] = arr[i]-arr[j];
            arr[i] = arr[i]-arr[j];
            j--;
        }
        System.out.println (Arrays.toString(arr));

    }
//    static void swapArray(int []arr , int i , int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
}
