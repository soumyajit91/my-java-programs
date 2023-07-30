package sample;

class bill extends Author
{
    int n;double amt;
    bill(String na,String a,String t,int r,int x )
    {
        super(na,a,t,r);
        n=x;
        amt=0.0;
    }
    void cal()
    {
        if(n>=1&&n<=100)
        amt=rent;
        else if(n<=200)
        amt=(n-100)*0.60+rent;
        else if(n<=300)
        amt=100*0.60+(n-200)*0.80+rent;
        else 
        amt=100*0.60+100*0.80+(n-300)*1+rent;
    }
    void show()
    {
        super.show();
        System.out.println("no.of calls "+ n);
        System.out.println("amount to be paid"+amt);
    }
}
