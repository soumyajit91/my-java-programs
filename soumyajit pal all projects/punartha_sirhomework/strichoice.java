package punartha_sirhomework;
//Accept a string and convert it into (i) UPPER CASE (ii) lower case (iii) Sentence case(iv) Title Case (v) tOgLe CasE (lower case to upper case and upper case to lower case simultaneously).
import java.util.*;
class strichoice
     {
         public static void main()
         {
             String n,n1=" ",n2,n3=" ",n4,n5;int k,i;char ch=' ';
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter a string to do work according to user choice");
             n=sc.nextLine();
             System.out.println("Enter ur choice 1.UPPER CASE 2.lower case 3.Sentence Case 4.Title case 5.tOgLe CaSe");
             k=sc.nextInt();
             switch(k)
             {
                 case 1:
                 System.out.println(n.toUpperCase());
                 break;
                 case 2:
                 System.out.println(n.toLowerCase());
                 break;
                 case 3:
                 n=" "+n;
                 for(i=0;i<n.length();i++)
                 {
                     ch=n.charAt(i);
                     if(ch==' ')
                     n1=n1+Character.toUpperCase(ch);
                     else
                     n1=n1+ch;
                    }
                 System.out.println(n1);
                 break;
                 case 4:
                 n2=Character.toUpperCase(n.charAt(0))+n.substring(1);
                 System.out.println(n2);
                 break;
                 case 5:
                 for(i=0;i<n.length();i++)
                 { k=n.charAt(i);
                   if(ch<=90)
                   k=k+32;
                   else if(ch<=122)
                   k=k-32;
                   ch=(char)k;
                   n3=n3+ch;
                    }
                 System.out.println(n3);
                  break;
                 default :
                 System.out.println("wrong input");
                }
            }
        }