package Arrays;
import java.util.Scanner;

public class secondMax {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the length of an array : ");
            int l = sc.nextInt();

            int [] arr = new int[l];
            System.out.println("Enter "+l+" element : ");
            for (int i = 0; i<l; i++){
                arr[i] = sc.nextInt();

            }
            System.out.println("Second Max = "+findSecondMax(arr));
        }
        static int max_val(int []arr){
            int max = Integer.MIN_VALUE;
            for (int i = 0; i<arr.length; i++){
                if (arr[i] > max){
                    max = arr[i];
                }
            }
            return max;
        }

        static int findSecondMax(int []arr){
            int max = max_val(arr);
            for (int i = 0; i<arr.length; i++){
                if (arr[i] == max){
                    arr[i] = Integer.MIN_VALUE;
                }
            }
            int secondMax = max_val(arr);
            return secondMax;
        }
 }

