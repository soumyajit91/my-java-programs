import java.util.*;
public class Twin
   {
       int twinp(int n)
          {
           int i,f=1;
           for(i=2;i<n;i++)
           {
               if(n%i==0)
               f=0;
            }
            return(f);
        }
       public static void main()
       {
           int m,p,x,y;
           Scanner sc=new Scanner(System.in);
           Twin ob = new Twin();
           System.out.println("Enter first number");
           m=sc.nextInt();
           System.out.println("Enter second number");
           p=sc.nextInt();
           x=ob.twinp(m);
           y=ob.twinp(p);
           if((x==1||y==1)&&(m-p==2||p-m==2))
           System.out.println(m+" and "+p+"  are twin  prime");
           else
           System.out.println(m+" and "+p+"  are not twin  prime");
        }
    }
                   
           