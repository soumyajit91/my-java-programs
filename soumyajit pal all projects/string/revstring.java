package string;

import java.util.Scanner;
public class revstring{

    public static void main(String[] args) {
        String str;
        System.out.println("Enter a sentence ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        String reversed =" "+reverseString(str)+"  ";
        int k=reversed.length();
        String word="",rev="";           

        String d="";
        for(int i=0;i<k;i++)
        { 

            char c=reversed.charAt(i);
            if( c==' ')
            {
                rev = reverseString(word);
                d=d+rev;
                word="";
            }

            word=word+c;
        }
        System.out.println("The reversed string is: " + d);

    }

    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;

        return reverseString(str.substring(1))+str.charAt(0);
    }
}