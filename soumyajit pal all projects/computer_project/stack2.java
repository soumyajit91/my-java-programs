package computer_project;

import java.util.*;
class stack2
{
    int a[];
    int top;
    stack2()
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
        if(top==-2)
            System.out.println("Stack underflow");
        else
            System.out.println(a[top--]);
        menu();
    }

    void display()
    {
        if(top==2)
            System.out.println("Stack underflow");
        else
        {
            for(int i=top;i>0;i--)
            {
                System.out.print(a[i]+',');
            }
        }
      menu();
    }
    void menu()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1:PUSH\n2:pop\n3:Display\n4:Quit");
        int ch;
        ch=sc.nextInt();
        if(ch==1)
        {
            int n=sc.nextInt();
            push(n);
        }
        else if(ch==2)
        {
            pop();
        }
        else if(ch==3)
        display();
        else
        System.out.println("Thank you");
    }
}
