package shinjini_programs;

 //WAP to accept 10 numbers in array and check a particular number is present or not
//Linear Search 
import java.util.*;
class Array_Linear_Search
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter the number : ");
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the number to be searched : ");
        int num=sc.nextInt();
        int p=-1;//initialize
        for(int i=0;i<10;i++)
        {
            if(a[i]==num)
            {
                p=i;// store the index value of the search number
                break;
            }
        }
        if(p==-1)
         System.out.println("Number not Present ");
        else
            System.out.println("Number present at index "+p);
    } }