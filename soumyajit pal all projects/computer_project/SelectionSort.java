package computer_project;

import java.util.*; 
class SelectionSort
{
    int n,i;
    int a[] = new int[100]; 
    public SelectionSort(int nn) //parameterized constructor
    {
        n=nn;
    }

    public void input()//function accepting array elements
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter elements");
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
    }

    public void display() //function displaying array elements
    {
        System.out.println();
        for(i=0;i<n;i++) 
        {
            System.out.print(a[i]+" ");
        }
    }

    public void sort() //function sorting array elements using selection sort technique
    {
        int j,temp,min;
        for(i=0;i<n-1;i++)
        {
            min =i; 
            for(j=i+1;j<n;j++)
            {
                if(a[j]<a[min]) min =j;
            }
            if(min!=i)
            {temp = a[i];
                a[i] =a[min];
                a[min] = temp; 
            }
        }
    }
    public static void main()//main function 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length");
        int no=sc.nextInt();
        SelectionSort x = new SelectionSort(no);
        x.input(); 
        System.out.print("Before sorting - "); 
        x.display();
        System.out.print("After sorting - ");
        x.sort();
        x.display(); 
    }
}
