package org.example;

public class ArraySumComparison {
    public static void main(String[] args) {


        //Write a java method which takes 2 int array parameters and tell if the summation of 2 arrays are equal or not
        int[] array1 = {1,2,3,4,10};
        int[] array2 = {1,2,3,4,10};
        boolean result = areArraysEqual(array1,array2);
        System.out.println("Are the sums of the two arrays equal? "+result);

    }
    public static int calculateSum(int[] array){
        int sum = 0;
        for (int number:array){
            sum=sum+number;
        }
        return sum;
    }
    public static boolean areArraysEqual(int[] array1, int[] array2){
        int sum1 = calculateSum(array1);
        int sum2 = calculateSum(array2);
        return sum1==sum2;
    }

}


