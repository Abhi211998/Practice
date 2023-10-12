package Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakeInput2 {
    public static void main(String[] args) throws IOException {

        float p,r,si;
        int n;
        InputStreamReader isr;
        BufferedReader br;
        isr = new InputStreamReader(System.in);
        br = new BufferedReader(isr);
        System.out.println("Enter the values of principle, rate, noOfYears");
        p=Float.parseFloat(br.readLine());
        r=Float.parseFloat(br.readLine());
        n=Integer.parseInt(br.readLine());
        si=p*r*n/100;
        System.out.println(si);
    }
}
