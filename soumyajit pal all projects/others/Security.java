package others;

import java.util.*;
class Security
     {
         String n;
         int h;
         double r,w;
         void get(String name ,int hour , double rate)
         {
             n= name;
             h=hour ;
             r= rate;
            }
         void calwage()
         {
             if(h<=40)
             w=r*40.0;
             if(h>40&&h<=60)
             w=(h-40)*1.5*r+40*r;
             if(h>60)
             w=(h-60)*2*r+20*1.5*r+40*r;
            }
         void display()
         {
             System.out.println("name"+"\t"+"hours"+"\t"+"wage in Rs");
             System.out.println(n+"\t"+h+"\t"+w);
            }
         public static void main()
         {
             Scanner sc=new Scanner (System.in);
             Security ob=new Security();
             System.out.println("enter name of the security guard");
             String name =sc.nextLine();
             System.out.println("enter the no. of hrs of work per week");
             int hour=sc.nextInt();
             System.out.println("enter the rate ");
             double rate=sc.nextDouble();
             ob.get(name,hour,rate);
             ob.calwage();
             ob.display();
            }
        }
    


                 