package Arrays;

//Write a java program to find duplicate elements in an array:

import java.util.*;

public class Duplicate {

    //Duplicate using Brute:
    private static void findDuplicatesBrute(int[] arr){

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){

                if(arr[i] == arr[j]){
                    System.out.println("Duplicate Element: " + arr[i]);
                }
            }
        }
        System.out.println("{TC-O(N^2), SC-1}");
    }

    //Duplicate using Sorting:
    private static void findDuplicateSorting(int[] arr){

        Arrays.sort(arr);

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                System.out.println("Duplicate Element: " + arr[i]);
            }
        }
        System.out.println("TC-O(N), SC-1");
    }

    //Duplicate using HashSet:

    private static void findDuplicateHashSet(int[] arr){

        HashSet<Integer> set = new HashSet<>();

        for(int element : arr){
            if(!set.add(element)){
                System.out.println("Duplicate Element: " + element);
            }
        }
        System.out.println("{TC-O(N), SC-O(N)}");
    }

    //Duplicate using HashMap:

    private static void findDuplicateHashMap(int[] arr){

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int element : arr){
            if(map.get(element) == null){
                map.put(element, 1);
            }
            else{
                map.put(element, map.get(element)+1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();

        for(Map.Entry<Integer, Integer> entry : entrySet){
            if(entry.getValue() > 1){
                System.out.println("Duplicate Element: " + entry.getKey()+ " found " + entry.getValue() + " times");
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[] {111, 333, 555, 777, 333, 444, 555};

        findDuplicatesBrute(arr);
        System.out.println("------------------------------------");

        findDuplicateSorting(arr);
        System.out.println("-------------------------------------");

        findDuplicateHashSet(arr);
        System.out.println("-------------------------------------");

        findDuplicateHashMap(arr);
        System.out.println("-------------------------------------");

    }
}
