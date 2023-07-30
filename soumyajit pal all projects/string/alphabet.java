



package string ;
import java.util.*;
class alphabet
      {
          public static void main()
          {
              Scanner sc=new Scanner(System.in);
              int i,j,p;
              char ch;
              System.out.println("enter the suitable String ");
              String str=sc.nextLine();
              str=str.toUpperCase();
              p=str.length();
              System.out.println("OUTPUT");
              for(i=65;i<=90;i++)
              {
                  for(j=0;j<p;j++)
                  {
                      ch=str.charAt(j);
                      if(ch==(char)i||ch==(char)(i+32))
                      System.out.println(ch);
                    }
                }
            }
        }
        
                     
                          
              