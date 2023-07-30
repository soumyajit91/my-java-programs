package others;
import java.util.*; 
class leapyr
  {
      public static void main()
      {
          Scanner sc=new Scanner (System.in);
          int year;
          System.out.println("Enter a year");
          year=sc.nextInt();
          if(year%100==0)
          {
              if(year%400==0)
              {
                  System.out.println(year+"  is a centuary year and a leap year");
                }
              else
              {
                  System.out.println(year+ " is a centuary year but not a leap year");
                }
            }
              else if(year%4==0)
              {
                  System.out.println(year+"  is aleap year");
                }
             else
             {
                 System.out.println(year+"not a leap year");
                }
            }
        }
          
          