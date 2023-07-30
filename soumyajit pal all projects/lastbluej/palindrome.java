package lastbluej;

import java.util.*;
class palindrome 
{
    String str,newstr;
    int len,i;
    void readword()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a word");
        str= sc.nextLine();
        len=str.length();
    }

    boolean checkPalindrome (String s)
    {
        String t="";
        for(i=0;i<s.length();i++)
            t=s.charAt(i)+t;
        if(s.equals(t))
            return true ;
        else 
            return false;
    }

    public void getPalindrome()
    {
        String t="";newstr="";
        if(checkPalindrome(str))
            newstr=str;
        else
            for(i=0;i<len-1;i++)
            {
                if(checkPalindrome(str+t))
                {
                    newstr=str+t;
                    break;
                }
                
                   
            }
    }

    void display()
    {
        System.out.println("The old word "+str);
        System.out.println("The new word "+newstr);
    }

    public static void main()
    {
        palindrome ob=new palindrome();
        ob.readword();
        ob.getPalindrome();
        ob.display();
    }
}