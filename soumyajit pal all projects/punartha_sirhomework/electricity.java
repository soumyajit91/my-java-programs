package punartha_sirhomework;

import java.util.*;
class electricity
{    
      String name="";int units=0;double bill=0.0;
    void input()
    {             
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the customer name");
        name=sc.nextLine();
        System.out.println("Enter the units consumed");
        units=sc.nextInt();
    }

    void calculate()
    {
        if(units<=100)
            bill=250+units*3.6;
        else if(units<=300)
            bill=250+360+(units-100)*4.1;
        else if(units>300)
            bill=250+360+820+(units-300)*5;
    }

    void display()
    {
        System.out.println("customer name"+"\t"+"units"+"\t"+"bill");
        System.out.println(name+"\t"+units+"\t"+bill);
    }

    public static void main()
    {
     
       electricity ob= new electricity();
       ob.input();
       ob.calculate();
       ob.display();
    }
}