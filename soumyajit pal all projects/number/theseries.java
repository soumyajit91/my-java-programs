package number;
import java.util.*;
class theseries
{
    int limit=0;
    int arr[]=new int[150];
    int i=0;
    theseries()
    { 
        limit=0;
    }

    void readList()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of no. u want to check");
        limit=sc.nextInt();
        for(i=0;i<limit;i++)
        {
            System.out.println("Enter the elemnent u want to check ");
            arr[i]=sc.nextInt();
        }
    }

    int Isprime(int y,int i)
    {
        if(i < y)
        {
            if(y % i != 0) 
            {
                return(Isprime(y, ++i));
            } 
            else
            {
                return 0; 
            }   
        }
            return 1;
        }
    

    void printResult()
    {
        for(i=0;i<limit;i++)
        {
            if(Isprime(arr[i],2)==1)
            {
                System.out.println(" its a prime no "+arr[i]);
            }
        }
    }
    public static void main()
    {
       theseries ob = new theseries();
       ob.readList();
       ob.printResult();
    }
}

