package string;
import java.util.*;
class encoder
   {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a string");
         
         String str=sc.nextLine();
         System.out.println("Enter the number  in encoder");
         int n=sc.nextInt();
         
         String word="";
         str=str.toUpperCase();
         for(int i=0;i<str.length();i++)
             {
                 char c= str.charAt(i);
                 int k=(int) c;
                 if((k>=65)&&(k<=90))
                 {
                     if((k+n)>90)
                     {
                         int l=(k+n)-90;
                         word=word+(char)(k+l);
                        }
                     else
                     word=word+(char)(k+n);
                    }
                 else
                 word=word+c;
                }
          System.out.println("the encode word");
          System.out.println(word);
        }
    }   