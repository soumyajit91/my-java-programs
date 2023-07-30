package number;

import java.util.*;
class test
         {
             public void oddevenprime(int num)
             {
                 int ch=0,i,flag=0;
                 System.out.println("the number "+num+" is");
                 if(num%2==0)
                 System.out.println("Even");
                 else
                 System.out.println("odd");
                 for(i=2;i<=num/2;++i)
                 {
                     if(num%2==0)
                     flag =1;
                     break;
                    }
                 if(flag==0)
                     System.out.println("and Prime");
                     else
                     System.out.println("but not prime");
                    }
             public static void main()
             {
                 test object1=new test();
                 int num;
                 Scanner sc=new Scanner(System.in);
                 test ob=new test();
                 System.out.println("Enter a number to be checked");
                 num=sc.nextInt();
                 ob.oddevenprime(num);
                }
            }
            
                 
                  



   
         
         
         
         
         
         
         
         
         
         
         
         
        
     

