
import java.util.*;
public class Demo{
   static void sort_elements(String my_str[], int n)
   {
      for(int j=0;j<n;j++)
     for(int i=j;i<n-1;i++)
     {
         String temp;
         String str= my_str[i].substring(0,1);
         String mgr=my_str[i+1].substring(0,1);
         int k=(char)str;
         int d=(int)mgr;
         if(k>d)
         {
             temp=str;
             str=mgr;
             mgr=temp;
            }
     }
   }
   public static void main(String args[])
   {
       int len=0;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter a sentence");
      String n= sc.nextLine()+" ",word="";
   
      String my_arr[] = new String[1000];
      for(int i= 1;i<n.length();i++)
      {
      char m = n.charAt(i);
       if(m==' ')
       {    
      my_arr[len]=word;
      len++;
      }
      else
      word=word+m;
     }
     
      sort_elements(my_arr,len);
      System.out.print("The sorted array is : ");
      for (int i=0; i<len; i++)
      System.out.print(my_arr[i]+" ");
   }
}