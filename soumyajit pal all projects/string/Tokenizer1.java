package string;
import java.util.*;
class Tokenizer1
{
    public static void main()
    {
        String str,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence :- ");
        str=sc.nextLine();
        StringTokenizer st=new StringTokenizer(str);
        int c=st.countTokens();
        System.out.println(" Original Sentence :-  " +str);
        System.out.println("No. of Words :- "+c);
        System.out.println("Words Are :- ");
        while(st.hasMoreTokens()==true)
        {
            s = st.nextToken();
            System.out.println(s);
        }

    }
}
