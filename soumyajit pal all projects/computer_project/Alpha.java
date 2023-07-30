package computer_project;

import java.util.*;
 class Alpha
 {
String str;
 int l;
 char c[] = new char[100]; 
public Alpha() //Alpha() constructor
 {
str = "";
 l =0; 
}
 public void readword() //function to read input string
 {
System.out.println("enter word - "); 
Scanner sc=new Scanner(System.in);
str = sc.nextLine();
 l = str.length();
 }
 public void arrange() //function to arrange string in ascending order 
{
int i,j; char temp;
 for(i=0;i<l;i++)
 {
c[i]= str.charAt(i);
 }
 for(i=0;i<l-1;i++) //loops for swapping of characters
 {
for(j=0;j<l-1-i;j++)
 {
if(c[j] > c[j+1])
 {
temp = c[j];
 c[j] = c[j+1];
 c[j+1] = temp;
 }
}
}
}
 public void display() //function to display the rearranged string 
 {
System.out.println();
 for(int i=0;i<l;i++) 
{
System.out.print(c[i]);
 }
}
 public static void main()  //main function 
{
Alpha obj = new Alpha();
 obj.readword();
 obj.arrange();
 obj.display();
 }
}
