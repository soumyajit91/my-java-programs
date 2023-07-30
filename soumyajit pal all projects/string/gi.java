package string;
class gi
{
public static void main(int n)
{
    int dig,s=n;
    {
        n=s;
        s=0;
        while(s>9)
        {
            while(n>0)
            {
                dig=n%10;
                s=s+dig;
                n=n/10;
            }
        }
        if(s==1)
        System.out.println(1);
        else
        System.out.println(0);
    }
}
}