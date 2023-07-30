package string;
import java.util.*;
public class Anagram
         {
             public static void main()
             {
                 int p1,p2,i,j,t=0;
                 String str1,str2;
                 char chr1,chr2;
                 Scanner sc=new Scanner(System.in);
                 System.out.println("enter the first word");
                 str1=sc.nextLine();
                 str1=str1.toLowerCase();
                 System.out.println("Enter the second word");
                 str2=sc.nextLine();
                 str2=str2.toLowerCase();
                 p1=str1.length();
                 p2=str2.length();
                 if(p1==p2)
                 {
                     for(i=0;i<p1;i++)
                     {
                         chr1=str1.charAt(i);
                         t=0;
                         for(j=0;j<p2;j++)
                         {
                             chr2=str2.charAt(j);
                             if(chr1==chr2)
                             t=1;
                            }
                         if(t==0)
                         break;
                        }
                     if(t==0)
                     System.out.println(str1+" and "+str2+"are not angram words");
                     else
                     System.out.println(str1+" and "+str2+"are  angram words");
                    }
                 else
                 System.out.println("wrong input!! re enter anagram");
                }
            }
            
                     