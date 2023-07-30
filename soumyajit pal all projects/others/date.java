package others;
import java.util.*;
class date
{
         static boolean isLeapYear(int y)
          {
              if((y%4==0&&y%100!=0)||y%400==0)
              return true;
              else
              return false;
            }
         public static void main()
          {
              int y=0;boolean c=false;
              date ob=new date();
              Scanner sc=new Scanner (System.in);
              System.out.println("Enter a year");
              y=sc.nextInt();
              c=ob.isLeapYear(y);
              if(c==true)
              System.out.println("is leap year");
              else
              System.out.println("not leap year");
            }
        }