package string ;
import java.util.*;
class FiboString
{
    String x,y,z;
    int n;
    FiboString()
    {
        x="a";
        y="b";
        z="ab";
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of terms");
         n=sc.nextInt();
        }
     
     void generate()
     {
        System.out.print(x+" , "+y+"  , "+z);  
        for(int i=0;i<n-3;i++)
        {
        x=y;
        y=z;    
        z=x+y;
        System.out.print("  ,  "+ z);
        
         
         
    }
}
    public static void main()
    {
    FiboString ob=new FiboString();
    ob.accept();
    ob.generate();
}
}