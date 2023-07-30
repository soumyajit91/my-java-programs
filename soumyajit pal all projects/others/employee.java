package others;

import java.util.*;
class employee
      {
          int pan;String name;double taxin,tax;
          void input()
          {
              Scanner sc=new Scanner(System.in);
              System.out.println("enter pan number");
              pan=sc.nextInt();
              System.out.println("enter the name of the account holder");
              name =sc.nextLine();
              name =sc.nextLine();
              System.out.println("enter the taxable income");
              taxin=sc.nextDouble();
            }
           void cal()
           {
               if (taxin<=100000)
               tax=0;
               if (taxin<=150000)
               tax=0.1*(taxin-100000);
               if (taxin<=250000)
               tax=5000+(0.2*(taxin-150000));
               if (taxin>250000)
               tax=25000+(0.3*(taxin-250000));
               
            }
            
            void display()
            {
                System.out.println("pan-number\t name \t taxable income \t tax income an empolyee");
                System.out.println(pan +"\t"+name+"\t"+taxin +"\t"+tax);
            }
            public static void main()
            {
                employee ob=new employee();
                ob.input();
                ob.cal();
                ob.display();
                }
        }
                
                