package Arrays;

//Write a Java program to find all pairs of elements in an integer array whose sum is equal to a given number?

import java.util.Arrays;

public class TargetSum {

    static void findThePairs(int[] arr, int target){

        Arrays.sort(arr);

        int i=0;
        int j=arr.length-1;

        while(i < j){
            if(arr[i]+arr[j] == target){
                System.out.println(arr[i] + " + " + arr[j] + " = " + (arr[i]+arr[j]));
                i++;
                j--;
            }else if(arr[i]+arr[j] < target){
                i++;
            }else if(arr[i]+arr[j] > target){
                j--;
            }
        }

    }

    public static void main(String[] args) {

        findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);

        findThePairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);

        findThePairs(new int[] {12, 13, 10, 15, 8, 40, -15}, 25);

        findThePairs(new int[] {12, 23, 10, 41, 15, 38, 27}, 50);

    }

}
