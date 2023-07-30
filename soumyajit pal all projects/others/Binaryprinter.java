package others;

import java.io.*;
class Binaryprinter
{
    static String filename="stu.dat";
    public static void main()
    {
        
        try
        {
        FileInputStream fr = new FileInputStream("info1.dat");
        DataInputStream dr= new DataInputStream(fr);
        boolean EOF= false;
        while(!EOF)
        {
            try
            {
                String str;Double rno;               
                str= dr.readUTF();                
                System.out.print("name"+str);
                 rno=dr.readDouble();
                System.out.println(" the taxable income "+rno);
              
            }
            catch(EOFException el)
            {
                System.out.println("end of file");
                EOF =true;
            }
            catch(IOException e)
            {
                System.out.println(e);
            }
        
       
    }
    
}
catch(FileNotFoundException e)
{
    System.out.println("File not found");
}
}
                }