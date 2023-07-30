package string;
import java.util.*;
public class AnagramSchool

         {
             String Lowercase(String n)
             {
                 String d=n.toLowerCase();
                 return d;
                }
             int length(String n)
              {  
                  int d= n.length();
                  return d;    
                }
             int ana ( String str1,String str2, int p1, int p2)
             {
                 char chr1,chr2;
                 int t=0,i,j;
                 
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
                  return t;     
                }
             public static void main()
             {
                 AnagramSchool ob=new AnagramSchool();
                 Scanner sc=new Scanner(System.in);
                 System.out.println("Enter the first word");
                 String str1 = sc.nextLine();
                  System.out.println("Enter the second word");
                  String str2 = sc.nextLine();
                 str1=ob.Lowercase(str1);
                 str2=ob.Lowercase(str2);
                 int t=0;
                 if(ob.length(str1)==ob.length(str2))
                 {
                     t=ob.ana(str1,str2,ob.length(str1),ob.length(str2));
                    }
                 if(t==0)
                     System.out.println(str1+" and "+str2+"are not angram words");
                     else
                     System.out.println(str1+" and "+str2+"are  angram words");
                    }
                }
                  
                  
                  
                  
                  
                  
                  
                  
                  
                 
                 