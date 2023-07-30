package number;
import java.util.*;
class poweris
{
    int base,expn;
    double p;

    poweris()
    {
        base=0;
        expn=0;
        p=0.0;
    }

    int power(int n,int m)
    {
        if(m==0)
            return 1;
        else 
            return (n*power(n,m-1)); 
    }

    void findResult()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base and exponent of the number respectively");
        base=sc.nextInt();
        expn=sc.nextInt();
        poweris ob= new poweris();
        p=ob.power(base,expn);        
    }

    void printResult()
    {
        System.out.println("the answer is = "+p);
    }

    public static  void main()
    {
        poweris ob= new poweris();
        ob.findResult();
        ob.printResult();
    }
}
 