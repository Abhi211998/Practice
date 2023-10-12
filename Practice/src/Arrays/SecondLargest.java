package Arrays;

//Write a Java program to find second largest element in an array of integers?

public class SecondLargest {

    private static int secondLarge(int[] arr){

        int Largest = arr[0];
        int sLargest = Integer.MAX_VALUE;

        for(int i=1; i<arr.length; i++) {
            if (arr[i] > Largest) {
                sLargest = Largest;
                Largest = arr[i];
            } else if (arr[i] != Largest && arr[i] > sLargest) {
                sLargest = arr[i];
            }
        }
        return sLargest;
    }

    public static void main(String[] args) {

        int[] arr = new int[] {47498, 14526, 74562, 42681, 75283, 45796};

        System.out.println(secondLarge(arr));
    }
}
