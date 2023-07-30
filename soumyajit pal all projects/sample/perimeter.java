package sample;
class perimeter extends Detail
{
    double a,b;
    perimeter(double c,double d)
    {
        a=c;b=d;
    }
    double calculate()
    {
        double r=2*(a+b);
        return r;
    }
    void show()
    {       
        System.out.println("the lenght of parrallelogram :-"+a);
        System.out.println("the breadth of parrallelogram :-"+b);
        System.out.println("the perimeter of parrallelogram :-"+calculate());
    }
}