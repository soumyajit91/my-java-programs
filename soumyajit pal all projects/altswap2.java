import java.util.*;
class altswap2
{
    static void alternaterev(String st)
    {
        st=st+ " ";
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
        System.out.println("Enter a paragraph were each sentence is seperated by '.''?'''!'");
        String para=sc.nextLine();  
        para=para+" ";
        char let=' ';int n,x=0,max=0,f=0,l=0;
        String sent=" ";
        altswap2 ob= new altswap2(); 
        for (n=0;n<para.length();n++)
        {
            let=para.charAt(n);
            if(let=='?'||let=='!'||let=='.')
            {
                
                 ob.alternaterev(para.substring(x,n));
                
                String str=para.substring(x,n);
                int m=str.length();
                if(max<m)
                {
                    max=m;
                    f=x;l=n;
                }                
                x=n+1;
            }           
        }
        System.out.println("The largest paragraph is:   "+para.substring(f,l));
    }
}

