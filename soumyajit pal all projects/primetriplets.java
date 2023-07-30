
 import java.util.*;
 class primetriplets
 {
   public static void main ()
   {
     Scanner SCR = new Scanner(System.in); // making scanner object 'SCR' 
     int c = 0, fr = 0, S, L;//variables declaration 
        boolean res1, res2, res3, res4;  //boolean type variables to decide prime factors
        System.out.print("Input start limit ");
       S = SCR.nextInt();// input value of 'S' using Scanner function nextInt() 
       System.out.print("Input last limit ");
      L = SCR.nextInt(); // input value of 'L' using Scanner function nextInt()
     while( S <= 0 || L<= 0 || S>L)// checking values of 'S' and 'L'

    {
    if(S<=0)
        System.out.println("Invalid input value of S, please re-enter ");
     if( L <= 0)
           System.out.println("Invalid input value of L, please re-enter ");
    if( S >L)
     System.out.println("Invalid input, S should be less then L, please re-enter "); 
    System.out.print("Input start limit ");//process to re-input values S = SCR.nextInt();
    S = SCR.nextInt();// input value of 'S' using Scanner function nextInt()
      System.out.print("Input last limit ");// input value of 'L' using Scanner function nextInt()
      L = SCR.nextInt();

  }//while loop closes here 
   System.out.println("Prime Triplets are :"); // now process to find prime triplets
   for( int num = S; num<=L; num++ )
        { res1 = IsPrime( num );// calling function by passing 'num' to variable 'q' 
         res2 = IsPrime( num+2 );// calling function by passing 'num+2' to variable 'q' 
         res3 = IsPrime( num+4 );// calling function by passing 'num+4' to variable 'q' 
        res4 = IsPrime( num+6);// calling function by passing 'num+6' to variable 'q'
        if( res1 == true && res2 == true && res4 == true)
             { fr++;  // count frequency of prime triplets 
               System.out.println(num+ "\t" + (num+2) + "\t" + (num+6)); // print the combinations

        }//if closes here 
         if( res1 == true && res3 == true && res4 == true) 
         {
             fr++;// count frequency of prime triplets
            System.out.println(num+ "\t" + (num+4) + "\t" + (num+6));//print the combination
        } //lif closes here
       }
    }
    static boolean IsPrime(int q)
    {
        int c=0;
        for( int k=1;k<=q;k++)
        {
            if(q%k==0)
            c++;
        }
        if(c==2)
        return true;
        else
        return false;
    }
}

       
       
       
       