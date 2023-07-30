
import java.io.*;
class Factorial{
    public static void main(String args[]) throws IOException//main function
    {BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter no =");int n = Integer.parseInt(br.readLine());
        //accepting no.
        Factorial obj = new Factorial();
        long f = obj.fact(n);System.out.println("Factorial ="+f);
        //displaying factorial 
    }
    public long fact(int n)//recursive fact() 
    {if(n<2)
        return 1;
        else 
        return (n*fact(n-1));
    }
}









