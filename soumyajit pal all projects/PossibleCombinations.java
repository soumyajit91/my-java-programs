import java.util.*;
public class PossibleCombinations 
{
 public static void main(String[] args) 
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number between 2 and 5");
     int n= sc.nextInt();
     if(( n>=2)&&(n<=5))
     {
     int input[]= new int[n];
     int d=1;
     for(int i= 0;i<n;i++)
        input[i]=d++;  
 if(n==2)
     
     {       
     for (int x = 0; x < n; x++) 
   {
       
    for (int y = 0; y < n; y++)
    {
    
         if (x != y ) 
      {
       System.out.println(input[x] + "" + input[y] );
      }
      
    }
}
}
 if(n==3)
     
     { 
     for (int x = 0; x < n; x++) 
   {
       
    for (int y = 0; y < n; y++)
    {
         
     for (int z = 0; z < n; z++) 
     {
      
        if (x != y && y != z && z != x) 
      {
       System.out.println(input[x] + "" + input[y] + "" + input[z]);
      }  
    }
}
}
}
if(n==4)
     
     {
     for (int x = 0; x < n; x++) 
   {
       
    for (int y = 0; y < n; y++)
    {
         
     for (int z = 0; z < n; z++) 
     {
            
      for (int p = 0; p < n; p++) 
     {  
      if(n==4)
     
     {
         if(x != y && y != z && z != x && p!= x && p!= y && p!=z)
          {
               System.out.println(input[x] + "" + input[y] + "" + input[z]+""+input[p]);
            }
        }
        }
    }
}
}
}
if(n==5)
     
     {
 for (int x = 0; x < n; x++) 
   {
       
    for (int y = 0; y < n; y++)
    {
         
     for (int z = 0; z < n; z++) 
     {
            
      for (int p = 0; p < n; p++) 
     { 
       for (int q = 0; q < n; q++) 
     {   
         if(n==5)
         {
           if(x != y && y != z && z != x && p!= x && p!= y && p!=z && x!=q && y!=q && z!=q && p!=q)
          {   
              System.out.println(input[x] + "" + input[y] + "" + input[z]+""+input[p]+ ""+ input[q]);
     }
    }
   }
  }
}
}
}
}
}
else
System.out.println("wrong input");
}
}