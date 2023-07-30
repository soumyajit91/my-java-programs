package string;
import java.util.*;
import java.io.*;
class display
         {
           public static void main()throws IOException
               {
                   Scanner sc=new Scanner (System.in);
                   FileWriter fwr=new FileWriter("Sentence.txt");
                   BufferedWriter bwr =new BufferedWriter(fwr);
                   PrintWriter ob=new PrintWriter(bwr);
                   String st;
                   System.out.println("Enter a sentence ");
                   st=sc.nextLine();
                   ob.println(st);
                   ob.close();
                   Scanner inp =new Scanner(System.in);
                   Scanner std=new Scanner(new File("Sentence.txt"));
                   System.out.println("Sentence               no.words                no. of vowels");
                   int i,c=0,w=0;
                   String str="";
                   while(std.hasNextLine())
                   {
                       str=std.nextLine();
                       
                       for(i=0;i<str.length();i++)
                       {
                           char ch=str.charAt(i);
                           if(ch==' ')
                           {
                               w++;
                            }
                           if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')||(ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
                            {
                                c++;
                            }
                        }
                    }
                    System.out.println(str+"\t\t"+(w+1)+"\t\t"+c);
                    std.close();
                }
            }
                    
                           
                   
                   
                   
                   
                   
                   



  