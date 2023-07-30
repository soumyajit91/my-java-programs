package string;
import java.util.*;
class question6
  {
      public static void main()
      {
          Scanner sc =new Scanner(System.in);
          int a,p;
          String str;
          char ch,chr;
          System.out.println("Enter a Sentence in upper case ");
          str=sc.nextLine();
          System.out.println("Enter 'f' to display all first character ,'l' to display all the last characters");
          System.out.println("enter the choice");
           ch=sc.next().charAt(0);
          switch (ch)
          {
              case 'f':
              case 'F':
              str=' '+str;
              p=str.length();
              System.out.println("the user output is");
              for(a=0;a<p;a++)
              {
                  chr=str.charAt(a);
                  if(chr==' ')
                  System.out.println(str.charAt(a+1));
                }
              break;
              case 'l':
              case 'L':
              str=str+' ';
              p=str.length();
              System.out.println("the user output is");
              for(a=0;a<p;a++)
              {
                  chr=str.charAt(a);
                  if(chr==' ')
                  System.out.println(str.charAt(a-1));
                }
              break;
              default :
              System.out.println("wrong choice");
            }
        }
    }
    
              
              
              
          