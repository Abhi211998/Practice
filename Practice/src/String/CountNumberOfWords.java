package String;

//Write a Java program to count the number of words in a string?

public class CountNumberOfWords {

    //Function to count number of words using library functions of string:
    private static void countWords(String s){

        String[] words = s.trim().split(" ");

        System.out.println("Number of words in String : " + words.length);

    }

    //Function to count number of words without library functions:

    private static void countWords2(String s){

        int count = 1;

        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == ' ' && s.charAt(i+1) != ' '){
                count++;
            }
        }
        System.out.println("Number of words in String :" + count);

    }


    public static void main(String[] args) {

        String s = "Abhishek Soni";

        countWords(s);

    }
}
