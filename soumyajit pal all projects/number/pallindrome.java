




package number ; 
import java.util.*;
class pallindrome
     {
         int reverse(int a)
          
              {
         
                     int rev=0,b;
                     while(a>0)
                     {
                          b=a%10;
                         rev=(rev*10)+b;
                         a=a/10;
                        }
                        return rev;
                    }
         int prime(int a)
         { int c=0;
             for(int j=1;j<=a;j++)
                 {
                 if (a%j==0)
                 {
                     c++;
                    }
                }
                if(c==2)
                return 0;
                else
                return 1;
            }
            
         public static void main()
         {
             Scanner sc=new Scanner (System.in);
             pallindrome ob=new pallindrome();
             int n[]=new int[5];
              int c,rev;
             System.out.println("Input 5 no.");
             for(int i=0;i<5;i++)
             {
                 n[i]=sc.nextInt();
                
               
             
             
                  c=ob.prime(n[i]);
                 if (c==0)
                   {
                      rev=ob.reverse(n[i]);
                    
                
                     if (rev==n[i])
                     {
                         System.out.println(n[i]+"is a pallindrome");
                        }
                      else
                      {
                          System.out.println(n[i]+"is not a pallindrome");
                          
                        }
                    }
                    
                }
            }
        
        }
                    
                  