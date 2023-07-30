package string;

import java.util.*;
class Data
{
    String str;
    int i;
    Data()
    {
        str= null;
    }

    void accept()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a sentence ending");
        str= " "+sc.nextLine();
    }

    void computePrint()
    {
        StringTokenizer st=new StringTokenizer(str,".? !");                 
        System.out.println(" Original Sentence :-  " +str); 
        int d=0;
        System.out.println("the number of words is   "+ st.countTokens());
        System.out.println("the token   "+"   no. of characters");
        while(st.hasMoreTokens()==true)
        {
            String s = st.nextToken();
            int k= s.length();
            d++;
            System.out.print( s+"\t \t \t ");
            System.out.println(+k);
        }
        
    }

    public static  void main()
    {
        Data ob = new Data();
        ob.accept();
        ob.computePrint();
    }
}
 