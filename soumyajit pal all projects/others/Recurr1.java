package others;

class Recurr1
{
    public void test (int i)
    {
        if(i>5)
            return ;
        else
        {
            System.out.println(i+" ");
            test(i+1);
        }
    }

    public void main ()
    {
        Recurr1 ob= new Recurr1();
        ob.test(1);
    }
}