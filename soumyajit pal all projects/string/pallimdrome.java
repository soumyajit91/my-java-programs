package string;
import java.util.*;
class pallimdrome
  {
       public static void main()
       {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter a sentence");
           String str=sc.nextLine();
           String word="",rev="";
           int k=str.length();
           int l=0,a=1;
           for(int i=0;i<k;i++)
           { 
               
               char c=str.charAt(i);
               if( c==' ')
               {
                   l=word.length();
                for ( int j =l - 1; j >= 0; j-- )
                  rev = rev + word.charAt(j);
                 if(rev ==word)
                  {
                      System.out.println(a +" th pallindromic word is"+word);
                      a++;
                       word="";
                    }
                }
               
                word=word+c;
            }
            System.out.println("there are total "+ (a-1) + "  pallindromic word");
        }
    }
  