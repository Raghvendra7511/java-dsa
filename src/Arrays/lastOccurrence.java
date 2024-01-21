package Arrays;

public class lastOccurrence {
    public static void main(String[] args) {
        int [] arr = new int[6];
        arr[0] = 5;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 5;
        arr[5] = 0;
        int x = 5;
        System.out.println("In given array last index for "+ x +" is : "+lastIndex(arr,x));

    }
    public static int lastIndex(int []arr, int x){
        int LI = -1;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]==x){
                LI = i;
            }
        }

        return LI;
    }
}
