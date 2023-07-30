package patternstore;

import java.util.*;
class pattern1
    {
        public static void main()
        {
            Scanner sc=new Scanner (System.in);
            int a,b,p,k=1;
            String st;
            System.out.println("Enter the word to print in the pattern");
            st=sc.nextLine();
            b=st.length();
            for(a=b;a>=0;a--)
            {
                for(p=1;p<=k;p++)
                {
                    System.out.print(" ");
                }
                System.out.println(st.substring(0,a));
                k++;
            }
        }
    }