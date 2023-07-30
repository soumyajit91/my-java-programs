class numb3
{
    void M (int c)
    {
        if(c==0)
            System.out.println(" ");
        else
        {
            System.out.println("Hello"+c);
            M(--c);
            System.out.println(" "+c);
        }
    }
    public String numbers1(int n)
    {
        if(n<=0)
        return" ";
        else
        return numbers1 (n-1)+n+ " ";
}
}