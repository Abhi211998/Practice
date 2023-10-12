package calofsi;

//Calculation of Simple Interest-->

public class CalOfSi {
    public static void main(String[] args) {

        float p,r,si;
        int n;
        p=1000.50f;
        r=25.5f;
        n=3;
        si = p*r*n/100;
        System.out.println(si);
    }
}
