package Arrays;

import java.util.Scanner;

public class tripletSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int s = sc.nextInt();

        int []arr = new int[s];
        System.out.println("Enter "+s+" element : ");
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target sum : ");
        int target = sc.nextInt();

        System.out.println("pair = "+tripletPair(arr,target));

    }
    static int tripletPair(int []arr,int target){
        int ans = 0;
        int n = arr.length;
        for (int i = 0; i<n; i++){
            for (int j = i+1; j<n; j++){
                for (int k = j+1; k<n; k++){
                    if (arr[i] + arr[j] + arr[k] == target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
