package shinjini_programs;

import java.util.*;
class Program3
{
    int pan;
    String name;
    double taxincome,tax; 
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee name");
        name=sc.nextLine();
        System.out.println("Enter personal account number of employee");
        pan=sc.nextInt();
        System.out.println("Enter annual taxable income");
        taxincome=sc.nextDouble();
    }
    public void calculate()
    {
        if(taxincome<=100000)
        tax=0.0;
        else if(taxincome>=100001 && taxincome<=150000)
        tax=0.1*(taxincome-100000);
        else if(taxincome>=150001 && taxincome<=250000)
        tax=0.2*(taxincome-150000)+5000;
        else
        tax=0.3*(taxincome-250000)+25000;
    }
    public void display()
    {
        System.out.println("Pan number\t\tName\t\tTax-income\t\tTax");
        System.out.println(pan+"\t\t"+name+"\t\t\t"+taxincome+"\t\t"+tax);
    }
    public static void main()
    {
        Program3 obj=new Program3();
        obj.accept();
        obj.calculate();
        obj.display();
    }
}