package string;
import java.util.*;
public class v13 {
   public static void main(String []args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the string");
       
	String str[] =new String [6];
	for(int i=0;i<6;i++)
	{
	    str[i]=sc.nextLine();
	    
	   }
	String temp;
	System.out.println("Strings in sorted order:");
	for (int j = 0; j < str.length; j++) {
   	   for (int i = j + 1; i < str.length; i++) {
		// comparing adjacent strings
		if (str[i].compareTo(str[j]) < 0) {
			temp = str[j];
			str[j] = str[i];
			str[i] = temp;
		}
	   }
	   System.out.println(str[j]);
	}
   }
}