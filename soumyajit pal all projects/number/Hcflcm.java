package number;

import java.util.Scanner;

public class Hcflcm
{
    private int a;
    private int b;
    
    public Hcflcm(int x, int y) {
        a = x;
        b = y;
    }
    
    public void calculate() {
        int x = a, y = b;
        while (y != 0) {
            int t = y;
            y = x % y;
            x = t;
        }
        
        int hcf = x;
        int lcm = (a * b) / hcf;
        
        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);
    }
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = in.nextInt();
        System.out.print("Enter second number: ");
        int y = in.nextInt();
        
        Hcflcm obj = new Hcflcm(x,y);
        obj.calculate();
    }
}