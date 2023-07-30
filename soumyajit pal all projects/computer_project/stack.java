package computer_project;

import java.util.*;
class stack
{
    int a[];
    int top;
    stack()
    {
        top=-1;
        a=new int[10];
    }

    void push(int n)
    {
        if(top==9)
            System.out.println("stack overflow");
        else
            a[++top]=n;
        menu();
    }

    void pop()
    {

        if(top==-1)
            System.out.println("stack underflow");
        else
            System.out.println(a[top--]);
        menu();
    }

    void display()
    {

        if(top==-1)
            System.out.println("stack underflow");
        else
        {
            for(int i=top;i>=0;i--)
                System.out.print(a[i]+",");
        }
        menu();
    }

    void menu()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1:push \n2:pop :Display \n4 :Quit");
        int ch;
        ch=sc.nextInt();
        if(ch==1)
        {
            int n=sc.nextInt();
            push(n);
        }
        else if(ch==2)
            display();
        else
            System.out.println("Thank you");
    }
}