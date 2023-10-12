package BinarySearch;

public class BinarySearchOnSortedArray_Recursive {

    public static int findTarget(int[] nums, int target, int start, int end){

        start=0;
        end=nums.length-1;

        for(int i=0; i<nums.length; i++){

            int mid=(start+end)/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                return findTarget(nums, target, start, mid-1);
            }else{
                return findTarget(nums, target, start+1, end);
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        int[] nums = new int[] {34,54,667,32535,134};
        int target = 667;
        System.out.println(findTarget(nums, target, 0, nums.length-1));

    }

}
