import java.util.*;
class difference
  {
      public static void main()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("date:-2>date:-1");
          System.out.println("for date 1");
          System.out.println("Enter a date");          
          int d=sc.nextInt();
          System.out.println("Enter a month");
          int m=sc.nextInt();
          System.out.println("Enter a year");
          int y=sc.nextInt();
          System.out.println("Enter a date:-2");
          int d1=sc.nextInt();
          System.out.println("Enter a month:-");
          int m1=sc.nextInt();
          System.out.println("Enter a year");
          int y1=sc.nextInt();
          
          int d3=d1-d;
          int m3=m1-m;
          int y3=y1-y;
          
          System.out.println("the difference in date is   "+d3);
        }
    }
          
          
          
          
          
          
          