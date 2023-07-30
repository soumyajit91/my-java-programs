package number;

import java.util.*;
class facinating
  {
      public static void main()
      {
          Scanner sc=new Scanner (System.in);
          System.out.println("Enter a number");
          int n=sc.nextInt();
          int n2 = n * 2;
          int n3 = n * 3;
          String con = n + "" + n2 + n3;
           boolean found = true;
          for(char i = '1'; i <= '9'; i++)
          {
            int count = 0;
            for(int j = 0; j < con.length(); j++)
            {
                char ch = con.charAt(j);
                if(ch == i)
                    count++;
            }
            if(count > 1 || count == 0){
                found = false;
                break;
            }
          }
          if(found==true)
            System.out.println(n + " is a fascinating number.");
          else
            System.out.println(n + " is not a fascinating number.");
    }
}
          
          
          
          
          
          