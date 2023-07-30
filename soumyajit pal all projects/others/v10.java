package others;
public class v10
{
    int add(int num1, int num2)
    {
        return num1+num2;
    }
    int add(int num1, int num2, int num3)
    {
        return num1+num2+num3;
    }
    int add(int num1, int num2, int num3, int num4)
    {
        return num1+num2+num3+num4;
    }
    public static void main(int num1,int num2,int num3,int num4) 
    {    
    	v10 obj = new v10();
    	//This will call the first add method
        System.out.println("Sum of two numbers: "+obj.add(num1, num2));
        //This will call second add method
        System.out.println("Sum of three numbers: "+obj.add(num1, num2, num3));
        //This will call third add method
        System.out.println("Sum of four numbers: "+obj.add(num1,  num2,num3,num4));
    }
}