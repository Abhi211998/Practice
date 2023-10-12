package String;

import java.util.HashMap;
import java.util.Set;

public class DuplicateChar {


    //
    private static void countDuplicate(String s){

        HashMap<Character, Integer> map = new HashMap<>();

        char[] arr = s.toCharArray();

        for(Character c : arr){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }

        Set<Character> charInString = map.keySet();

        System.out.println("Duplicate characters in " + s);

        for(Character ch : charInString){
            if(map.get(ch) > 1){
                System.out.println(ch + " : " + map.get(ch));
            }
        }

    }



    public static void main(String[] args) {

        String input = "Better Butter";

        countDuplicate(input);

    }
}
