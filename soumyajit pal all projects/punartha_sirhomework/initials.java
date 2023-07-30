package punartha_sirhomework;
//Accept name of a person consisting of First Name, Middle Name and Last Name. Displaythe First letter of first name followed by dot (.), First letter of middle name followed by dot(.) and the last name. For example, if the name entered is Subhash Chandra Bose thenthe output to be S. C. Bose

import java.util.*;
class initials
  {
      public static void main()
      {
          String n,word=" ";int i,freq=0;char ch=' ';
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter first name,middle name and last name of the person");
          n=sc.nextLine();
          n=" "+n;
          for(i=0;i<n.length();i++)
                 {
                     ch=n.charAt(i);
                     if(ch==' '&&freq<2)
                     {
                         word=word+Character.toUpperCase(n.charAt(i+1))+'.';
                         
                        }
                     if(ch==' ')
                     freq++;  
                    if(freq>2)   
                      {
                          word=word+ch;
                        }
                    }
          System.out.println("name is"+word);
        }
    }          