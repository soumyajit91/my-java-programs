package array;
import java.util.*;
class Surname
     {
         public static void main()
         {
             String st,sn,st1="",st2="";
             int i,p;
             char chr;
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the full name");
             st=sc.nextLine();//Accept the full name
             st=' '+st;
             p=st.lastIndexOf(' ');//obtain the last blank
             sn=st.substring(p);//extract surname
             for (i=0;i<p;i++)//extract initial from each word
             {
                 chr=st.charAt(i);
                 if(chr== ' ')
                 st1=st1+st.charAt(i+1)+'.';
                }
             st2=st1+sn;
             System.out.println("surname with initials are");
             System.out.println(st2);
            }
        }
        
 