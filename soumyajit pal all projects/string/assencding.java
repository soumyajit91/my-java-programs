package string;


import java.util.*;
public class assencding{
   static void sort_elements(String my_str[], int n)
   {
       String temp="";
      for (int i=1 ;i<n; i++){
        if (my_str[i].length()>my_str[i+1].length())
        {
        temp=my_str[i+1];
        my_str[i+1]=my_str[i];
        my_str[i]=temp;
      }
      System.out.println("the required array is");
       for( i=0;i<n;i++)
       {
           
           System.out.print ( my_str[i]+ " ");
        } 
   }
 }
   public static void main()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a sentence");
       String str=sc.nextLine(),word="";
       int k= str.length();int r=0,m=0;
       
       for(int i=0;i<k;i++)
           {                
               char c=str.charAt(i);
               if( c==' ')
               {
                   m++;                  
                   word="";                   
                }
                word=word+c;
            }
          String my_str[]=new String[m];  
        for(int i=0;i<k;i++)
           {                
               char c=str.charAt(i);
               if( c==' ')
               {
                  
                   my_str[r]=word;
                    r++;
                   word="";                   
                }
                word=word+c;
            }
          
       sort_elements(my_str,m);
      
    }
}
           
           
           
           
           
           
           
           
           
           
           
           
           
           
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       