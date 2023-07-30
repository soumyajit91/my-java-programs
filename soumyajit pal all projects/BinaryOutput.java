import java.io.*;

class BinaryOutput
      {                    
              static String filename="marks.dat";
              static InputStreamReader isr= new InputStreamReader(System.in);
              static BufferedReader stdin= new BufferedReader(isr);
              public static void main()
              {
                  try
                  {
                      int rno;int marks,marks1,marks2; String str;
                      FileOutputStream fw= new FileOutputStream("marks.dat");
                      DataOutputStream dw= new DataOutputStream(fw);
                      System.out.println("Enter no. of students");
                      int n=Integer.parseInt(stdin.readLine());
                      for(int i=0;i<n;i++)
                      {
                          System.out.println("Enter Roll no.");
                          rno=Integer.parseInt(stdin.readLine());
                          System.out.println("Enter Name of student");
                          str=(stdin.readLine());
                          System.out.println("Enter Marks1 :");
                          marks=Integer.parseInt(stdin.readLine());
                           System.out.println("Enter Marks2 :");
                           marks1=Integer.parseInt(stdin.readLine());
                           System.out.println("Enter Marks3 :");
                            marks2=Integer.parseInt(stdin.readLine());
                            dw.writeUTF(str); 
                          dw.writeInt(rno);
                         
                          dw.writeFloat(marks);
                           dw.writeFloat(marks1);
                          dw.writeFloat(marks2);
                   }
       
                }
                catch(IOException e)
                {
                    System.err.println(e);
                }
            }
        }