package calofsi;

import java.util.Scanner;

public class CalOfSiWithInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float p,r,si;
        int n;
        System.out.println("Enter principle, interest, noOfYears");

        p = sc.nextFloat();
        r = sc.nextFloat();
        n = sc.nextInt();

        si = p*r*n/100;

        System.out.println(si);

    }
}
