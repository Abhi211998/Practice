package String;

//Write a Java program to count the total number of occurrences of a given character in a string without using any loop?

public class CountNumberOfChar {

    static void countChar(String s, Character c){

        int count = s.length() - s.replace(Character.toString(c), "").length();

        System.out.println("Number of occurances of" + c + "in" + s + " = " + count);

    }




    public static void main(String[] args) {

        String s = "Java is java again java again";

        char c = 'a';

        countChar(s,c);

    }
}
