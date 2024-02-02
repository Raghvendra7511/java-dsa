package Arrays;

import java.util.Arrays;

public class non_DecreasingArrayType_1 {
    public static void main(String[] args) {
        int[] arr = {-15, -7, -4, 0, 1, 3, 5, 7};

        System.out.println(Arrays.toString(non_DecreasingSquare(arr)));
    }
    static int[] non_DecreasingSquare(int []arr){
        int n = arr.length;
        int [] ans = new int[n];
        int k = n-1;
        int j = n-1;

        for (int i = 0; i<=j; ){
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                ans[k] = arr[i] * arr[i];
                i++;
                k--;
            }
            else {
                ans[k--] = arr[j] * arr[j];
                j--;
            }
        }
        return ans;

    }
}
