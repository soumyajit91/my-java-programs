package others;

import java.io.*;
class Binary_appender
{
    static String filename="stu.dat";
    public static void main()
    {
        
        try
        {
        FileInputStream fr = new FileInputStream("info.dat");
        DataInputStream dr= new DataInputStream(fr);
         BufferedReader inp= new BufferedReader(new InputStreamReader(System.in));
          String str;Double rno;
              FileOutputStream std = new FileOutputStream("info1.dat");
              DataOutputStream mat = new DataOutputStream(std);
        boolean EOF= false;
        while(!EOF)
        {
           str= dr.readUTF();
              rno=dr.readDouble();
              if(rno>100000)
              {
                  mat.writeUTF(str);
                  mat.writeDouble(rno); 
                }
               
            }
          std.close();
           mat.close();   
        }
            catch(EOFException el)
            {
                System.out.println("end of file");
                //EOF=true;
            }
            catch(IOException e)
            {
                System.out.println(e);
            }
        
     
}  
}  
           


