package number;
class Stack
    {
        int a[],n,top;
        Stack(int size)
        {
            top=-1;
            n=size;
            a=new int[n];
        }
        void push(int x)
        {
            if (top==n-1)
            System.out.println("Stack Overflow ");
            else
            a[++top]=x;
        }
        int pop()
        {
            if (top==-1)
            {
                System.out.println("Stack Underflow ");
                return -999;
            }
            int x=a[top--];
            return x;
        }
    }