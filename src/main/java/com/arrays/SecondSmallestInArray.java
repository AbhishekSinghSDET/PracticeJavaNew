package com.arrays;

public class SecondSmallestInArray {

/*    🧠 Memory Aid: 3 Simple Steps
“Track two: Smallest and Smaller-than-smallest (but bigger than the smallest)”

Start both min and secondMin as MAX value

If current number < min → update both:
secondMin = min
min = current

 Else if current > min but < secondMin → update secondMin only*/

    public static int findSecondSmallestNum(int[] arr) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num > min && num < secondMin) {
                secondMin = num;
            }
        }
        return secondMin;
    }


    public static void main(String[] args) {
        int[] a = {2,5,7,1,9};
        System.out.println(findSecondSmallestNum(a));
    }
}
