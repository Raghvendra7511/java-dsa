package Arrays;

import java.util.Arrays;

public class prefixSumArray {
    public static void main(String[] args) {
        int []arr = {2,4,3,1,6,7,5,9,8};

        System.out.println("Array = "+Arrays.toString(arr));
        System.out.println("Prefix of given array = "+Arrays.toString(prefixSum(arr)));
//        prefixSumInPlace( arr);
//        System.out.println(Arrays.toString(arr));

    }
    static int[] prefixSum(int []arr){
        int n = arr.length;
        int [] ans = new int[n];
        ans[0] = arr[0];
        for (int i = 1; i<n; i++){
            ans[i] = ans[i-1] + arr[i];
        }
        return ans;
    }
//    static void prefixSumInPlace(int []arr){
//        for (int i = 1; i< arr.length; i++){
//            arr[i] = arr[i-1] + arr[i];
//        }
//    }
}
