class Output11
{
    public static void show(int n)
    {
        if(n++<=5)
        {
            if(++n<=3)
            {
                System.out.println("A : "+n);
                n++;
            }
            else
                System.out.println("B : "+n);
            System.out.println("C : "+n);
            show(++n);
        }
        System.out.println("D : "+n);
    }
}