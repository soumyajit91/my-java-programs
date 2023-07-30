package number;

class test5
{
public void calculate(int n1,int n2)   
{  
          
        int Temp, res=0;  
        while(n2 != 0)  
        {  
            Temp = n2;  
            n2 = n1 % n2;  
            n1 = Temp;
            System.out.println( n1+" "+n2);  
        }  
        res = n1;  
        System.out.println( res);  
}
}