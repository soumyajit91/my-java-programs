package string;
import java.util.*;
class piglatin
      {
          public static void main()
          {
              Scanner sc=new Scanner(System.in);
              int x,y;
              String str1,str2,str;
              System.out.println("enter the word to be turn to piglatin");
              str=sc.nextLine();
              char b;b=0;
              x=str.length();
              System.out.println("The pig latin word of this given string ");
              for(y=0;y<x;y++)
              {
                  b=(str.charAt(y));
                  if(b=='a'||b=='i'||b=='o'||b=='u'||b=='A'||b=='E'||b=='I'||b=='O'||b=='U')
                  break;
                }
              str1=str.substring(y,x);
              str2=str.substring(0,y);
              System.out.println(str1+str2+"ay");
            }
        }