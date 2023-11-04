package shuffling;
import java.util.Random;

public class Array {

    public static void main(String arg[]) {
        int arr[] = {1,2,3,4,5,6,7};
        mixed(arr,7);
       
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void mixed(int[] a,int n) {
        
        Random ran = new Random();
       

        for (int i = n - 1; i > 0; i--) {
            int j = ran.nextInt(i + 1);
           
            // Swap elements at i and j
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}
