package String;

public class StringRotated {

    private static void rotatedString(String s1, String s2){

        String s3 = s1 + s1;

        if(s1.length() != s2.length()){
            System.out.println("No rotation");
        }else if(s3.contains(s1)){
            System.out.println("s1 and s2 are rotation of each other");
        }else{
            System.out.println("No rotation");
        }

    }




    public static void main(String[] args) {

        String s1 = "JavaJ2eeStrutsHibernate";

        String s2 = "StrutsHibernateJavaJ2ee";

        rotatedString(s1, s2);

    }
}
