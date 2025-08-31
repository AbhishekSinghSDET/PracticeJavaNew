package com.arrays;

import com.OOPS.inheritance.Inherit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContiguousArray {

    /*input is an array
    * eg: 1,2,4,5,10,20
    * target= 30
    * output: 10,20*/


    public static List<Integer> findContiguousArray(int[] arr, int target){



        for(int i = 0 ; i<arr.length;i++){
            int sum = 0;
            List<Integer> ls = new ArrayList<>();
            for(int j = i; j<arr.length;j++){
                sum = sum + arr[j];
                ls.add(arr[j]);

                if(sum==target){
                    return ls;
                }
            }
        }

        return Collections.emptyList();

    }

    public static void main(String[] args) {

        int[] a = {1,2,4,5,10,20};

        System.out.println(findContiguousArray(a,30));
    }
}
