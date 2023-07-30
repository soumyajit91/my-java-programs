package others;

import java.util.*;
class courier_services
      {
          public static void main(String args[])
          {
              Scanner sc=new Scanner (System.in);
              System.out.println("welcome to kolkata courier services");
              System.out.println("enter service 'O' for odinary 'E' for express");
              char ch=sc.next().charAt(0);
              String name="a";double bill=0;
              switch (ch )
                {
                     case 'E':
                         System.out.println("welcome to express courier branch");
                          
                            System.out.println("enter the weight of the courier in grams");
                      double a=sc.nextDouble();
                      
                      if(a<=100)
                        
                            bill=80;
                            else if(a<=500)
                            bill=80+(7*(a-100));
                            else if(a>500)
                            bill=80+(7*400)+(a-500*(6.5));
                             System.out.println("enter the name of the person");
                              name=sc.nextLine();
                              break;  
                              
                     case 'o' :
                     System.out.println("welcome to odinary courier branch");
                      System.out.println("enter the weight of the courier in grams");
                       a=sc.nextDouble();
                      
                      if(a<=100)
                        
                            bill=50;
                            else if(a<=500)
                            bill=50+(4*(a-100));
                            else if(a>500)
                            bill=50+(4*400)+(a-500*(3.5));
                             System.out.println("enter the name of the person");
                              name=sc.nextLine();
                              break; 
                           
                    default:
                              System.out.println("wrong input try again later");
                           
                        }
                        System.out.println("name of customer"+name+"the bill  "+bill);
                            System.out.println("thank you vist again");
                    }
                }
                            
                              
                             