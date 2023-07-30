
import java.util.*;
import java.io.*;
public class Wrbfile
          {
              public static void main()throws IOException
                         {
                            Scanner in= new Scanner(System.in);
                           Scanner sc=new Scanner(System.in);
                           int n;
                           System.out.println("Enter the number of records to be stored");
                           n=sc.nextInt();
                           String name[]= new String[n];
                           int rollno[]=new int[n];
                           int marks1[]=new int[n];
                           int marks2[]=new int[n];
                           int marks3[]=new int[n];
                           int marks4[]=new int[n];
                           int marks5[]=new int[n];
                           int tmarks[]=new int[n];
                           FileOutputStream fos=new FileOutputStream("Marks.dat");
                           DataOutputStream ob=new DataOutputStream(fos);
                           int i;
                           int rn[]=new int[n];
                           for( i=0;i<n;i++)
                           {
                               System.out.println("Enter the name");
                               name[i]=in.nextLine();
                               
                               
                               System.out.println("Enter the roll no");
                               rn[i]=sc.nextInt();
                               System.out.println("The marks of five different subjects are");
                               marks1[i]=sc.nextInt();
                               marks2[i]=sc.nextInt();
                               marks3[i]=sc.nextInt();
                               marks4[i]=sc.nextInt();
                               marks5[i]=sc.nextInt();
                               ob.writeUTF(name[i]);
                               ob.writeInt(rn[i]);
                               ob.writeInt(marks1[i]);
                               ob.writeInt(marks2[i]);
                               ob.writeInt(marks3[i]);
                               ob.writeInt(marks4[i]);
                               ob.writeInt(marks5[i]);
                            }
                           ob.close();
                           fos.close();
                           FileInputStream fin=new FileInputStream("marks.dat");
                           DataInputStream ffin=new DataInputStream(fin);
                           String n1;
                           int m1,m2,m3,m4,m5,tot=0,r,t;double p;
                           char g;
                           boolean eof=false;
                           while(!eof)
                           {
                               try
                                {
                                    n1=ffin.readUTF();
                                    r=ffin.readInt();
                                    m1=ffin.readInt();
                                    m2=ffin.readInt();
                                    m3=ffin.readInt();
                                    m4=ffin.readInt();
                                    m5=ffin.readInt();
                                    t=(m1+m2+m3+m4+m5);
                                    p=(double)t/5;
                                    System.out.println("Name:\t"+n1+"  "+"Roll No."+"   "+ r);
                                    System.out.println("Marks1:\t"+m1+"    "+ "Marks2:\t"+m2+"  "+"Marks3:\t"+m3+"Marks4:\t"+m4+"Marks5:\t"+m5);
                                    if(p>=85)
                                    {
                                        g='A';
                                    }
                                    else if((p<85)&&(p>=60))
                                    {
                                        g='B';
                                    }
                                    else if((p<60)&&(p>=40))
                                    {
                                        g='C';
                                    }
                                    else
                                    { 
                                        g='D';
                                    }
                                    System.out.println("Total:\t"+t+"  "+"percentage:\t"+"   "+p+"   "+"grade:\t"+g);
                                }
                               catch (EOFException e)
                               {
                                   System.out.println("End of the file encountered ");
                                   eof=true;
                                }
                            }
                            ffin.close();
                        }
                    }
                    
                               
                               
                                                                                                                                                                                                                                                                                                                                                                                                                      