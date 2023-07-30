import java.util.*;
class arrray1
{
    static void display(int a[][])
    {
        int i,j,n=a.length,n1=a[0].length;      
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    public static void main()
    {
        int x,y,max,temp,i,j;
        arrray1 ob= new arrray1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row  of the array");
        x=sc.nextInt();
         System.out.println("Enter column  of the array");
         y=sc.nextInt(); 
         if(x>2&&x<10)
         {
        System.out.println("Enter the array elements");
        int arr[][]=new int [x][y];
        for(i=0;i<x;i++)
        {
            for(j=0;j<y;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("the orginal array is");
        ob.display( arr);
        max=arr[0][0];
        for(i=0;i<x;i++)
        {
            for(j=0;j<y;j++)
            {
                if(max<arr[i][j])                
                    max=arr[i][j];
            }
        }
        for(i=0;i<x;i++)
        {
            for(j=0;j<y;j++)
            {  
                if(j==0||i==0||j==(x-1)||i==(y-1))
                    arr[i][j]=max;
            }
        }
        System.out.println("the modified array");
        ob.display(arr);
    }
    else
    System.out.println("wrong input");
}

}
