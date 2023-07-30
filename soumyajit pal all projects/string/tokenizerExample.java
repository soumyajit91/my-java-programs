package string;
import java.util.*;
class tokenizerExample
   {
       public static void main()
       {
           Scanner sc=new Scanner (System.in);
           int n=0;
           System.out.println("Input a string ");
           
           StringTokenizer data = new StringTokenizer(sc.nextLine());
           n=data.countTokens();
           System.out.println("Number of tokens"+n);
           for(int counter =0;counter<n; counter++)
           {
               System.out.println(data.nextToken());
            }
        }
    }
