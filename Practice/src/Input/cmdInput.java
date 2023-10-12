package Input;

public class cmdInput {
    public static void main(String[] args) {

        float p,r,si;
        int n;
        p=Float.parseFloat(args[0]);
        r=Float.parseFloat(args[1]);
        n=Integer.parseInt(args[2]);
        si=p*r*n/100;
        System.out.println(si);
    }
}
