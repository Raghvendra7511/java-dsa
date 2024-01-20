package Arrays;

public class maxOfArray {
    public static void main(String[] args) {
        int [] arr = {56,54,67,59,99,34,79};

        System.out.println("Max value is : "+maxValue(arr));
        }
    static int maxValue(int[]arr){
        int ans = 0;
        for (int i = 0; i < arr.length ; i++ ){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}

