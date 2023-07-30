package punartha_sirhomework;
////Accept two strings and check out whether 2nd string is in the 1st string or not, if it exists then display the position of its first occurrence in the main string.
import java.io.*;
class str1
{
    public static void main()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence");
        String sen = br.readLine();
        System.out.println("Enter a word");
        String w = br.readLine();
        int ls=sen.length();
        int lw=w.length();
        sen=sen+" ";
        int i,c=0,f=0,j;
        int ar[]=new int[ls];
        System.out.println();
        for(i=0;i<ls-lw+1;i++)
        {
            if((sen.substring(i,lw+i)).equalsIgnoreCase(w))
            {
                c++;
                
                for(j=i;j<=lw+i-1;j++)
                {
                    ar[f]=j;
                    f++;
                }
                break;
            }
        }
        for(j=f;j<ar.length;j++)
            ar[j]=-1;
        if(c>0)
        {
            System.out.println("The word exists in the sentence");
            System.out.println("The indexes in the 1st string in which the 2nd word is present are: ");
            for(j=0;j<ar.length;j++)
            {
                if(ar[j]!=-1)
                    System.out.println(ar[j]+" ");
            }
            
        }
    }
}