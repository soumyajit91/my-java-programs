
import java.util.*;
class sampleB
  {
      public static void main()
      {
           Scanner sc= new Scanner(System.in);
          System.out.println("Enter a number");
          int n=sc.nextInt();
          try{

                if(n>-1)
                System.out.println(" ok");
                else
                throw new Exception("Negative value of X Coordinate");
            }  

                catch(Exception d){
                    System.out.println(d.getMessage());
                    

                     }


                }
            }
       