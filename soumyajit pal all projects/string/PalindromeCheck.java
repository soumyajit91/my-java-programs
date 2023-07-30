package string;

import java.util.*;
class PalindromeCheck
{
    
    static int isPal(String s)
    {   
        if(s.length() == 0 || s.length() == 1)
        {
            return 1; 
        }
           
        if(s.charAt(0) == s.charAt(s.length()-1))
        {
        return isPal(s.substring(1, s.length()-1));
       }
        return 0;
    }

    public static void main()
    {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String for check:");
        String string = scanner.nextLine();
        
        if(isPal(string)==1)
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is not a palindrome");
    }
}