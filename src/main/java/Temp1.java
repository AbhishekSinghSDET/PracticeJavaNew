import java.util.Arrays;

public class Temp1 {


    public static int[] rotate(int[] arr){

        int n = arr.length;
        int zero = 0;
        int nonZero = 0;
        int[] result = new int[n];
        int[] temp = new int[n];



        for(int a : arr){
            if(a==0){
                result[zero++] = a;
            }
            else {
                temp[nonZero++] = a;
            }
        }

        for(int i = 0; i<nonZero;i++){
                result[zero++] = temp[i];
        }



        return result;
    }

    public static void main(String[] args) {
       int[] a = {0,1,1,2,0,1,4,1};
        System.out.println(Arrays.toString(rotate(a)));

    }
}
