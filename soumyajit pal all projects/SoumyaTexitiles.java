import java.util.*;
import java.io.*;
public class SoumyaTexitiles
         {
             public static void main()throws IOException
                 {
                   FileWriter fout =new FileWriter("RV.txt");
                   BufferedWriter ffout = new BufferedWriter(fout); 
                   PrintWriter ob= new PrintWriter(ffout);
                   Scanner sc=new Scanner (System.in);
                   int i;
                   String adm,name1,name2,cl;
                   int total;
                   System.out.println("Ener Admin no. ,name,class and total marks");
                   for(i=1;i<=10;i++)
                   {
                       System.out.println("enter the admin.no");
                       adm= sc.next();
                       System.out.println("Enter the first name ");
                       name1=sc.next();
                       System.out.println("Enter the surname name");
                       name2=sc.next();
                       System.out.println("Enter Class");
                       cl=sc.next();
                       System.out.println("Enter marks");
                       total=sc.nextInt();
                       ob.println(adm);
                       ob.println(name1);
                       ob.println(name2);
                       ob.println(cl);
                       ob.println(total);
                    }
                    ffout.close();
                }
            }