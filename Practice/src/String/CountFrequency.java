package String;

import java.util.HashMap;

//Write a Java program to count the number of occurrences of each character in a string?
public class CountFrequency {

    private static void countCharFreq(String s){

        HashMap<Character, Integer> map = new HashMap<>();

        char[] strArray = s.toCharArray();

        for(Character c : strArray){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }
        System.out.println(s + " : " + map);

    }


    public static void main(String[] args) {

        String s = "Java J2EE Java JSP J2EE";

        countCharFreq(s);

    }
}
