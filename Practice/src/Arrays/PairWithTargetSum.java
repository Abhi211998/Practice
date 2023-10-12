/*\     *     Given an array of sorted numbers and a target sum, find a pair in
        *     the array whose sum is equal to the given target.
        *     <p>Write a function to return the indices of the two numbers (i.e. the pair) such that they
        *     add up to the given target.
        * @note Example 1:
        *     <p>Input: [1, 2, 3, 4, 6], target=6 Output: [1, 3] Explanation: The numbers at index 1 and 3
        *     add up to 6: 2 + 4 = 6
        * @note Example 2:
        *     <p>Input: [2, 5, 9, 11], target=11 Output: [0, 2] Explanation: The numbers at index 0 and 2
        *     add up to 11: 2 + 9 = 11  */






package Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;

public class PairWithTargetSum {


    public static int[] findPair(int[] arr, int targetSum){

        HashMap<Integer, Integer> nums = new HashMap<>();

        for(int i=0; i<arr.length; i++){

            if(nums.containsKey(targetSum-arr[i])){
                return new int[] {nums.get(targetSum-arr[i]), i};
            }else{
                nums.put(arr[i], i);
            }
        }

        return new int[] {-1, -1};

    }


    public static void main(String[] args) {

        int[] arr = new int[] {1, 2, 3, 4, 6};

        int target = 7;

        System.out.println(Arrays.toString(findPair(arr, target)));

    }



}
