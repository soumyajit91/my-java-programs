package array;
import java.util. *;
public class Matrix
{
    static Scanner sc=new Scanner(System.in);
    int arr[] []=new int[25] [25];
    int m,n;
    Matrix(int mm, int nn)
    {
        m=mm;
        n=nn;
    }

    void accept()
    {
        System.out.println(" Enter elements of array");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n; j++)
                arr[i][j]=sc.nextInt();
        }
    }

    Matrix add(Matrix A)
    {
        Matrix B=new Matrix(m,n);
      
        for(int i=0;i<m;i++)
        {
            int k= m-1;
            for(int j=0;j<n; j++)
               { B.arr[i][j]= arr[i][j] + A.arr[i][k];
                   k--;
                }
                
        }
        return B;
    }

    void display()
    {
        for(int i=0;i<m;i++)
        {
            System.out.println();
            {
                for(int j=0;j<n;j++) 
                    System. out.print(arr[i][j] +" \t"); 
            } 
        } 
    } 

    public static void main() 
    { 
        System.out.print("\n Size of array"); 
        int x=sc.nextInt(); 
        int y=sc.nextInt(); 
        Matrix A=new Matrix(x, y); 
        Matrix B=new Matrix(x, y); 
        Matrix C=new Matrix(x, y); 

        A.accept(); 
        B.accept(); 
        A.display();
        System.out.println(" ");
        B.display();
        System.out.println(" ");
        C=A.add(B); 
        C.display(); 
    } 
}
