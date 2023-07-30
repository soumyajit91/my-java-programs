package number;
import java.util.*;
class magiccomposite
{
    int magic(int n)
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
                if (s==1)
                return 1;
                else 
                return 2;
            }
     int composite (int a)
    {
        int c=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            c++;
            
     }
     if (c>2)
      return 1;
     else
      return 2;
    }
    public static void main()
     {
          Scanner sc=new Scanner(System.in);
         magiccomposite ob=new magiccomposite ();
        System.out.println("enter lower and upper range ");
        int lr=sc.nextInt();
        int ur=sc.nextInt();
        if(lr<=ur)
        {
            for(int i =lr;i<=ur;i++)
            {
                if(ob.composite(i)==1)
                {
                    if(ob.magic(i)==1)
                    {
                        System.out.println(i+"is magic composite number");
                    }
                }
            }
        }
    }
}
         
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    