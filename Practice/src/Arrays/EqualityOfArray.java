package Arrays;

// Write a Java program to check the equality of two arrays?

import java.util.Arrays;

public class EqualityOfArray {

    //Function to check equality of 2 arrays using iterative method:
    private static void equality(int[] arr1, int[] arr2){

        boolean equalOrNot = true;

        if(arr1.length == arr2.length){
            for(int i=0; i<arr1.length; i++){
                if(arr1[i] != arr2[i]){
                    equalOrNot = false;
                }
            }
        }
        else{
            equalOrNot = false;
        }

        if(equalOrNot){
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Arrays are not equal");
        }


    }

    //Function to check equality of 2 arrays using Arrays.equals() method:

    private static void equlaityUsingArrays(int[] arr1, int[] arr2){
        if(Arrays.equals(arr1, arr2)) {
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Arrays are not equal");
        }
    }


    public static void main(String[] args) {

        int[] arrayOne = new int[] {2, 5, 1, 7, 4};

        int[] arrayTwo = new int[] {2, 5, 1, 7, 4};

        equality(arrayOne, arrayTwo);
        System.out.println("-----------------------------------");

        equlaityUsingArrays(arrayOne, arrayTwo);

    }
}
