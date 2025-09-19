import java.util.*;

public class Rough {

    public static int[] charFreqEncoding(int[] arr){
        int left = 0;
        int right = arr.length-1;

        while (left < right){
            if(arr[left]==0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else {
                left++;
                right--;
            }
        }

        return arr;

    }


    public static void main(String[] args) {
       int[]  a = {1,2,0,4,0,6,0};

        System.out.println(Arrays.toString(charFreqEncoding(a)));

    }
}
