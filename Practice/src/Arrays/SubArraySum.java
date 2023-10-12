package Arrays;

//Write a Java program to find continuous sub array whose sum is equal to a given number?

import java.util.Arrays;

public class SubArraySum {

    private static void findSubArray(int[] arr, int target) {

        int sum = arr[0];
        int start = 0;

        for(int i=1; i<arr.length; i++){

            sum += arr[i];

            while(sum > target && start <= i-1){
                sum -= arr[start];
                start++;
            }

            if(sum == target){
                System.out.println("Continuos sub array of " + Arrays.toString(arr) + "whose sum is " + target + " is ");
                for(int j=start; j<=i; j++){
                    System.out.print(arr[j] + " ");
                }
                System.out.println("");
            }
        }

    }


    public static void main(String[] args) {

        findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);

        findSubArray(new int[]{12, 5, 31, 13, 21, 8}, 49);

        findSubArray(new int[]{15, 51, 7, 81, 5, 11, 25}, 41);

    }


}
