package Arrays;

import java.util.Arrays;

public class k_stepRotate {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int k = 2;

        rotateInPlace(arr,k);
        System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(rotate(arr,k)));

    }
    static void swap(int []arr, int i, int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
    static void reverse(int []arr, int i, int j){
        int n = arr.length;

        for (; i<j; i++){
            swap(arr,i,j);
            j--;
        }
    }
    static void rotateInPlace(int []arr, int k){
        int n = arr.length;
        k = k % n;
        reverse(arr , 0 , n-k-1);
        reverse(arr , n-k , n-1);
        reverse(arr , 0 , n-1);

    }

//    static int[] rotate(int []arr, int k){
//        int n = arr.length;
//        k = k % n;
//        int []ans = new int[n];
//        int j = 0;
//        for (int i = n-k; i<n; i++){
//            ans[j++] = arr[i];
//        }
//        for (int i = 0; i<=n-k-1; i++){
//            ans[j++] = arr[i];
//
//        }
//
//        return ans;
//    }
}
