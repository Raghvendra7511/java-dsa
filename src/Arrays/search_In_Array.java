package Arrays;

public class search_In_Array {
    public static void main(String[] args) {
        int []arr = {5,6,7,4,8,2,9};
        int x = 2;
        
            System.out.println("Found " + x + " at index : " + searchingDigitInArray(arr, x));

    }
    static int searchingDigitInArray(int []arr , int x){
        int ans = -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                ans = i;
                break;
            }
        }
        return ans;
    }
}