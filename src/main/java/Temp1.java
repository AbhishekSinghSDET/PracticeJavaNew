import java.util.Arrays;
import java.util.*;

public class Temp1 {

    public static void main(String[] args) {

        int[] arr = {0,1,2,3,4,0,0,0,0,5,6};
        int zero = 0;
        int nonZero = 0;
        int[] result = new int[arr.length];
        int[] temp = new int[arr.length];


        for(int a : arr){
            if(a!=0){
                result[nonZero++] = a;
            }
            else {
                temp[zero++] = a;
            }
        }

        for(int i = 0; i<zero;i++){
            result[nonZero++] = 0;
        }


        System.out.println(Arrays.toString(result));

    }
}
