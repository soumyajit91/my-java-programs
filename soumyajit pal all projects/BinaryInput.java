import java.io.*;
class BinaryInput
{
    static String filename="stu.dat";
    public static void main()
    {
        
        try
        {
        FileInputStream fr = new FileInputStream("marks.dat");
        DataInputStream dr= new DataInputStream(fr);
        boolean EOF= false;
        while(!EOF)
        {
            try
            {
                 int rno, marks,marks1,marks2; String str;
               
                str= dr.readUTF();                
                System.out.print("name"+str);
                 rno=dr.readInt();
                System.out.println(" roll number  ");
                marks=dr.readInt();
                System.out.print("Marks1   :"+marks);
                marks1=dr.readInt();
                System.out.print("Marks2  :"+marks1);
                marks2=dr.readInt();                
                System.out.print("Marks3 :"+marks2);
                int total=marks+marks1+marks2;
                System.out.println("Total :"+total);
                int per= (total)/3;
             System.out.print("  percentage:" +per);
            if(per>=85)
                System.out.print("Grade : A");
            else if(per>=60)
                System.out.print("Grade : B");
             else if(per>=40)
             System.out.print("Grade : C");
             else
               System.out.print("Grade : D");
                
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