import java.util.*;
class Odious
      {
        int num[]  ;
        int n,i;
        Odious()
        { 
            n=0;
        }
        Odious(int nx)
        {
            n=nx;
            num= new int[n];
        }
        void inputArray()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter "+n+" Odious number ");
            for(i=0;i<n;i++)
            {
                num[i]=sc.nextInt();
            }
        }
        void printOdious()
        {
         int count = 0;
         int d[]=new int[100];
         int k=0;
      for(int j=0;j<n;j++) 
      {
           
          k=num[j];        
          while (k!=0)
        {
          
          
          if(k%2==1)
          count++;
          k=k/2;
       
        
      } 
      if(count%2==1)
      System.out.println(k+"ITS odius no.");
      else
      System.out.println("not odious number");
      count=0;
    }       
   }
   public static void main()
   {
       Scanner sc=new Scanner (System.in);
       System.out.println("Enter the no. of elements which u will enter");
       int nx=sc.nextInt();
       Odious ob=new Odious(nx);
       ob. inputArray();
       ob.printOdious();
    }
}
            
            
            
            
            