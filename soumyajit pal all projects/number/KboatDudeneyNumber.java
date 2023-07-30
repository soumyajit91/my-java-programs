package number;

import java.util.Scanner;

public class KboatDudeneyNumber
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int freq=0;
        System.out.println("Enter the number: ");
        int l=sc.nextInt();
        int u=sc.nextInt();
        for(int n=l;n<=u;n++)
        {
            //Check if n is a perfect cube
            int cubeRoot = (int)Math.round(Math.cbrt(n));
            if (cubeRoot * cubeRoot * cubeRoot == n) {
                //If n is perfect cube then find
                //sum of its digits
                int s = 0;
                int t = n;
                while (t != 0) {
                    int d = t % 10;
                    s += d;
                    t /= 10;
                }

                if (s == cubeRoot) {
                    System.out.print(n+" " );
                    freq++;
                }                
                }
            } 
        System.out.println();
        System.out.println("Frequency"+freq);
            }
        }
    
