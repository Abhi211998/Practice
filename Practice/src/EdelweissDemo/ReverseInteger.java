package EdelweissDemo;

public class ReverseInteger {


    private static void reverse(int input){

        int rev = 0;

        while(input>0){
            int rem = input%10;
            rev = rev*10 + rem;
            input = input/10;
        }
        System.out.println(rev);
    }


    public static void main(String[] args) {

        int input = 1234;
        reverse(input);

    }
}
