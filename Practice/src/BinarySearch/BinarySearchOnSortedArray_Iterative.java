package BinarySearch;

public class BinarySearchOnSortedArray_Iterative {

    public static int findTarget(int[] nums, int target){

        int start=0;
        int end=nums.length-1;

        while(start<end) {

            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = new int[] {28,48,19,58,128};

        int target = 58;

        System.out.println(findTarget(arr, target));

    }

}
