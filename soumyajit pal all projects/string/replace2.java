package string;
import java.util.*;
class replace2
    {
        public static void main()
        {
            Scanner sc=new Scanner (System.in);
            System.out.println("enter a sentence in upper case");
            String str=sc.nextLine();
            int p=str.length();
            String word="";
            char ch;
            for(int i=0;i<p;i++)
                   {
                       ch=str.charAt(i);
                       if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
                       {
                           word=word+ch;
                        }
                        if((ch!='A')&&(ch!='E')&&(ch!='I')&&(ch!='O')&&(ch!='U')&&(ch!=' '))
                          {
                            char chr=(char)(((int)ch)+1);
                            if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
                            {
                                  chr=(char)(((int)ch)-1);
                                }
                            word=word+chr;
                        }
                        if(ch==' ')
                        word=word+" ";
                    }
             System.out.println(word);
            }
        }
           