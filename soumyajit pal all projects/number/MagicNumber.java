package number;
public class MagicNumber
      {
          public static void main(int n)//enters a user input number
          {
              int d,s;
              s=n;
              while(s>9)
              {
                  n=s;s=0;
                  while(n>0)
                  {
                      d=n%10;
                      s=s+d;
                      n=n/10;
                    }
                }
               if(s==1)
               System.out.println("Magic Number");
               else
               System.out.println("Not a magic number");
            }
        }
        
                
                  