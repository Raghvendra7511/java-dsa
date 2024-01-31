package Arrays;

import java.util.Arrays;

public class sortZeroesAndOnes {
    public static void main(String[] args) {

        int [] arr = {1,1,0,0,1,0,0,0,0,1,1,0,1,0};
        sortedZeroesAndOnes(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int []arr , int i, int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
    static void sortedZeroesAndOnes(int [] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while (i<j){
            if (arr[i] == 1 && arr[j] == 0){
                swap(arr,i,j);
                i++;
                j--;
            }
            if (arr[i] == 0){
                i++;
            }
            if (arr[j] == 1){
                j--;
            }
        }
    }
}
