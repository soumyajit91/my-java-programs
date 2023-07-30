package array;
import java.util.*;
class Mixer
{
    int n,i;
    int arr[];
    Mixer(int nn)
    {
        n=nn;
        arr=new int[n];
    }

    void accept()
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the array elements");
        arr[0]=0;
        for(i=0;i<n;i++)
        {
            
            arr[i]=sc.nextInt();
            if(i!=0)
            {
            if(arr[--i]>=arr[++i])
            {
                
                System.out.println("pls enter correct value");
                
                i--;
            }
        }
    }
    }

    Mixer mix(Mixer A)
    {
        Mixer B = new Mixer (n+A.n);
        int x=0;
        for(int i=0;i< n;i++)
        {

            B.arr[x++]=arr[i];

        }	
        for(int j=0;j< A.n;j++)
        {

            B.arr[x++]=A.arr[j];
        } 
        return B;
    }

    void display()
    {
        for(int i=0;i< n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main()
    {
        Scanner sc1=new Scanner(System.in);
        System.out.println("ENTER SIZE OF FIRST ARRAY");
        int size1=sc1.nextInt();
        Mixer P=new Mixer(size1);
        P.accept();
       
        
        System.out.println("ENTER SIZE OF SECOND ARRAY");
        int size2=sc1.nextInt();
        Mixer Q=new Mixer(size2);
        Q.accept();
        int l=0;
         
        Mixer R=P.mix(Q);
        R.display();
    }
}


               
