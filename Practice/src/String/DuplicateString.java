package String;

//Write a Java program to find the duplicate words and their number of occurrences in a string?

import java.util.HashMap;
import java.util.Set;

public class DuplicateString {

    private static void duplicateWords(String s){

        String[] words = s.split(" ");

        HashMap<String, Integer> wordCount = new HashMap<>();

        for(String word : words){
            if(wordCount.containsKey(word.toLowerCase())){
                wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase())+1);
            }else{
                wordCount.put(word.toLowerCase(), 1);
            }
        }

        Set<String> wordsInString = wordCount.keySet();
        for(String word : wordsInString){
            if(wordCount.get(word) > 1){
                System.out.println(word + " : " + wordCount.get(word));
            }
        }
    }

    public static void main(String[] args) {

        duplicateWords("Bread butter and bread");

        duplicateWords("Java is java again java");

        duplicateWords("Super Man Bat Man Spider Man");
    }
}
