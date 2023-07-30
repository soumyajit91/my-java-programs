package computer_project;

import java.util.*;
 class VowelReplace 
{
public static void main( ) //main function
 {
Scanner sc=new Scanner (System.in);
System.out.println("Enter a String");
String a=sc.nextLine();//accepting a string
 System.out.println("Original String -"+a);
 int z=0;
 for(z=0;z<a.length();z++) //loop for replacing vowels with "*" 
{
if(a.charAt(z)=='a')
a=a.replaceAll("a","*"); 
if(a.charAt(z)=='e')
a=a.replaceAll("e","*");
if(a.charAt(z)=='i')
a=a.replaceAll("i","*");
if(a.charAt(z)=='o')
a=a.replaceAll("o","*");
if(a.charAt(z)=='u') 
a=a.replaceAll("u","*");
}
System.out.println("New String -"+a); //displaying the result
 }
}
