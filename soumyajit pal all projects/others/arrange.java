package others;
import java.util.*;
class arrange
   {
       public static void main()
       {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter three numbers to be aranged");         
           int a=0,b=0,c=0;
           a=sc.nextInt();
           b=sc.nextInt();
           c=sc.nextInt();
           int big=0,big2=0,big3=0;
           big=a;
           if(b>big)
           {
           big=b;
             }
           if(c>big)
           {
               big=c;
            }
           if(a==big)
            {
             if(b>c)
             {
                 big2=b;
                 big3=c;
                }
             else
             {
             big2=c;
             big3=b;
             }
           }
           else if(b==big)
           {
               if(a>c)
               {
                   big2=a;
                   big3=c;
                }
               else
               {
                   big2=c;
                   big3=a;
                }
            }
            else if(c==big)
            {
                if(a>b)
                {
                    big2=a;
                    big3=b;
                }
                else
                {
                    big2=b;
                    big3=a;
                }
            }
            System.out.println("the numbers in descending order is  "+big+"    "+big2+"    "+big3);
        }
    }
           
           
           
           
           
