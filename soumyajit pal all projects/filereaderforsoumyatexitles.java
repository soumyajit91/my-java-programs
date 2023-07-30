
import java.util.*;
import java.io.*;
public class filereaderforsoumyatexitles
      {
        public static void main()throws IOException
          {
              FileReader fin=new FileReader("RV.txt");
              BufferedReader ffin = new BufferedReader(fin);
              Scanner sc=new Scanner(System.in);
              int p;
              System.out.println("Enter 1 to display the records");
              System.out.println("Enter 2 to display the record getting higest marks");
              System.out.println("Enter ur choice");
              p=sc.nextInt();
              switch(p)
              {
                 case 1 :
                 int i=0;
                 String adm,name1,name2,cl;
                 int total;
                 System.out.println("display all records of the file Rv.txt");
                 System.out.println("Adm.No       Name                           class     total ");
                 Scanner s1=new Scanner(new File ("RV.txt"));
                 while(s1.hasNext())
                 {
                     adm=s1.next();
                     name1=s1.next();
                     name2=s1.next();
                     cl=s1.next();
                     total=s1.nextInt();
                     System.out.println(adm+"\t"+name1+"\t"+name2+"\t"+cl+"\t"+total);
                    }
                    s1.close();
                    break;
                    case 2:
                    int max=0;
                    String ad="",n1="",n2="",c="";
                     Scanner s2=new Scanner(new File ("RV.txt"));
                     while(s2.hasNext())
                     {
                        adm=s2.next();
                        name1=s2.next();
                        name2=s2.next();
                        cl=s2.next();
                        total=s2.nextInt();
                         if(max<total)
                         {
                             max=total;
                             ad=adm;
                             n1=name1;
                             n2=name2;
                             c=cl;
                            }
                        }
                      System.out.println("The record getting highest marks");
                      System.out.println("Adm.No       Name                           class     total ");
                      System.out.println(ad+"\t"+n1+"\t"+n2+"\t"+c+"\t"+max);
                    }
}
} 