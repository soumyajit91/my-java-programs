package computer_project;

import java.util.*;
class pronic
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
      
        System.out.println("enter a number");
        int n =sc.nextInt();// enters the pronic number 
        int j=0;
        for(int i=1;i<=n;i++)// pronic checking 
        {
            if(i*j==n)
            {
                System.out.println("pronic number");
                break;
            }
            j++;
    }
}
 }      
