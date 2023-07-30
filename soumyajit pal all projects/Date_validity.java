import java.util.*;
class Date_validity
 {
     public static void main()
     {
         Scanner sc=new Scanner (System.in);
         System.out.println("Enter the day");
         int d=sc.nextInt();
         System.out.println("Enter the month");
         int m= sc.nextInt();
         System.out.println("Enter the year");
         int y= sc.nextInt();
         if(((y%4==0)&&(y%100!=0))||(y%400!=0))
         {
             if((m==2)&&(d<30)&&(d>0))
             {
                 System.out.println("valid date ");
                }
             else if((m==2)&&(d>30))
                System.out.println("not a valid date");
               else if(m%2==0)
           {  
               if(d<31&&d>0)  
             {
                 System.out.println("valid year");
               }
               else
               {
                  System.out.println("not valid date");
               }  
            }
           else if(m%2==1)
           {
                if(d<32&&d>0)  
             {
                 System.out.println("valid year");
               }
               else
               {
                  System.out.println("not valid date");
               }  
            }
          }
          else if(m==2)
            {
                if(d<29&&d>0)
                System.out.println("valid year");
                else
                System.out.println("Invalid year");                
            }
             else if(m%2==0)
           {
                if(d<31&&d>0)  
                {
                    System.out.println("valid year");
                }
                else
                {
                    System.out.println("not valid date");
                }
            }
              else if(m%2==1)
              {  
               if(d<32&&d>0)  
                {
                    System.out.println("valid year");
                }
                else
                {
                    System.out.println("not valid date");
                }
            }
        }
    }
        

  