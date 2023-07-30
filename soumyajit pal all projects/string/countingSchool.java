package string;
import java.util.*;
class countingSchool 
{
    int vowels(String word)
    {
        int i,l,v=0;
        char chr;
        l=word.length();
        for(i=l-1;i>=0;i--)
        {
            chr=word.charAt(i);
            if((chr=='a')||(chr=='e')||(chr=='o')||(chr=='u')||(chr=='A')||(chr=='E')||(chr=='I')||(chr=='O')||(chr=='U'))
            v=v+1;
        }
        return (v);
    }
    public static void main()
    {
        int i,k=0;
        String word;
        Scanner sc=new Scanner (System.in);
        countingSchool ob=new countingSchool ();
        System.out.println("Enter a word");
        word=sc.nextLine();
        k=ob.vowels(word);
        System.out.println("Total number of vowels present in the string="+k);
    }
}
        