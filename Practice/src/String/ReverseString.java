package String;

// Write a Java program to reverse a string?

public class ReverseString {

    //Reverse a string using StringBuffer
    private static void reverse1(String s) {

        StringBuffer sb = new StringBuffer(s);

        System.out.println(sb.reverse());

    }

    //Reverse a string using Iterative:
    private static void reverse2(String s){

        char[] strArray = s.toCharArray();

        for(int i=s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
    }

    //Reverse a string using recursive:

    private static String reverse3(String s){

        if(null == s || s.length() <= 1){
            return s;
        }

        return reverse3(s.substring(1))+s.charAt(0);
    }

    public static void main(String[] args) {

        String demo = "MYJava";

        reverse1(demo);
        System.out.println("------------------------------------");

        reverse2(demo);
        System.out.println("------------------------------------");

        String ans = reverse3(demo);
        System.out.println(ans);
    }
}
