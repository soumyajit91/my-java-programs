
import java.io.*;
class Solve{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("First number: ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Second number: ");
        int b = Integer.parseInt(br.readLine());
        int hcf = gcd(a, b);
        int lcm = a * b / hcf;
        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);
    }
    public static int gcd(int p, int q){
        if(q == 0)
            return p;
        return gcd(q, p % q);
    }
}