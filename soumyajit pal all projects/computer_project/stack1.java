package computer_project;

import java.util.*;
class stack1
{
    int a[];
    int top;
    stack1()
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
        System.out.println();
        menu();
    }

    void menu()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1:push \n2:pop\n3:Display \n4 :Quit");
        int ch;
        ch=sc.nextInt();
        switch(ch)

        {
            case 1:
            System.out.println("Enter the elements inside the stack");
            int n=sc.nextInt();            
            push(n);
            break;
            case 2:
            System.out.println("popped");
            pop();
            break;
            case 3:
            display();
            default:
            System.out.println("Thank you");
            
        }
    }
}
 