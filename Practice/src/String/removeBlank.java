package String;

public class removeBlank {

    //Using built in elements:
    private static void removeSpaces(String s){

        String withoutSpaces = s.replaceAll("\\s+" , "");

        System.out.println(withoutSpaces);

    }

    //Without using built in elements:
    private static void removeSpaces2(String s){

        char[] arr = s.toCharArray();
        String withoutSpaces = "";

        for (char c : arr) {
            if (c != ' ' && c != '\t') {
                withoutSpaces = withoutSpaces + c;
            }
        }
        System.out.println(withoutSpaces);
    }

    public static void main(String[] args) {

        String input = "OneSpace TwoSpaces  ThreeSpaces   FourSpaces    Tab        End";

        removeSpaces(input);
        System.out.println("-----------------------------------------");

        removeSpaces2(input);

    }
}
