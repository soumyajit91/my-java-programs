package string;

import java.util.*;
class altswap
{
    static void alternaterev(String st)
    {
        String word=" ",sentence=" ";
        for (int n=0;n<st.length();n++)
        {
            char ch=st.charAt(n);int k=0;
            if(ch!=' ')
            {
                word=word+ch;
                k++;
            }
            else
            {
                int l =word.length();
                char ch1=word.charAt(0),ch2=word.charAt(l-1);
                String rev =ch2+word.substring(1,l-1)+ch1;                
                sentence=sentence+rev;
                k=0;
                word=" ";
            }
          
        }
          System.out.println(sentence);
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a paragraph were each sentence is seperated by '.''?'''1'");
        String para=sc.nextLine();        
        char let=' ';int n;
        String sent=" ",s,sentrev=" ",wordtemp=" ";
        int sentno=1;
        for (n=0;n<para.length();n++)
        {
            let=para.charAt(n);

            if(let!='?'||let!='!'||let!='.')
            {
                sent=sent+let;
            }
            else
            { 
                if(sentno%2!=0)
                {

                    sent=sent+".";
                    int wordlength=0;char ch=' ';
                    while(ch!='.')
                    {
                        ch=sent.charAt(wordlength);
                        wordlength++;
                        wordtemp=wordtemp+ch;
                        if(ch==' ')
                        {
                            sentrev=wordtemp.charAt(1)+wordtemp.substring(1,wordlength-1)+wordtemp.charAt(wordlength);
                            wordlength=0;
                            wordtemp=" ";
                        }
                    }
                    altswap ob=new altswap();
                    ob.alternaterev(sentrev);
                    sent=" ";
                }
                sentno++;

            }
        }
    }
}

