package array;

import java.util.Scanner;

public class KboatDDAEvenOdd
{
    public void computeSumNProduct() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of array elements");
        int k=in.nextInt();
        int N[][] = new int[k][k];
        long evenSum = 0, oddProd = 1;
        System.out.println("Enter the elements of "+k+" x "+k+" DDA: ");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                N[i][j] = in.nextInt();
                if (N[i][j] % 2 == 0)
                    evenSum += N[i][j];
                else
                    oddProd *= N[i][j];
            }
        }
        
        System.out.println("Sum of all even numbers = " + evenSum);
        System.out.println("Product of all odd numbers = " + oddProd);
    }
}