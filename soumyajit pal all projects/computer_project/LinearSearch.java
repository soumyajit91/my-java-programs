package computer_project;

import java.util.*; 
class LinearSearch
{
    int n,i;
    int a[] = new int[100];
    Scanner sc=new Scanner (System.in);
    public LinearSearch(int nn)
    {
        n=nn; 
    }

    public void input()//function for obtaining values from user
    {
        System.out.println("enter elements"); 
        for(i=0;i<n;i++) 
        {
            a[i] = sc.nextInt();
        }
    }

    public void display() //function displaying array values 
    {
        System.out.println(); 
        for(i=0;i<n;i++) 
        {
            System.out.print(a[i]+" ");
        }
    }

    public void search(int v) //linear search function
    {
        int flag=-1;
        for(int i=0; i<n ; i++)
        {
            if(a[i] == v) 
                flag =i; 
        }
        if(flag== -1 ) 
            System.out.println("not found"); 
        else
            System.out.println(v+" found at position - "+flag);
    }

    public static void main(String args[])//main function 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array");
        int no=sc.nextInt();
        LinearSearch obj = new LinearSearch(no); 
        obj.input();
        obj.display();
        System.out.println("enter no. to be searched -"); //accepting the values to be searched 
        int v = sc.nextInt();
        obj.search(v);
    }
}
