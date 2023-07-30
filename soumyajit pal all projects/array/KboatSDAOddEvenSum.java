package array;
import java.util.Scanner;
public class KboatSDAOddEvenSum
{
    public void displayOddEvenSum()
    {       
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=in.nextInt();
        int arr[] = new int[n];        
        System.out.println("Enter "+n+" numbers");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = in.nextInt();
        }       
        int oddSum = 0, evenSum = 0;       
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
                evenSum += arr[i];
            else
                oddSum += arr[i];
        }       
        System.out.println("Sum of Odd numbers = " + oddSum);
        System.out.println("Sum of Even numbers = " + evenSum);
    }
}