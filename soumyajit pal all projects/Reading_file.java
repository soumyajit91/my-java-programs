import java.io.*;
class Reading_file
{
    static void main() throws IOException
   {
        String rollno, marks,marks1,marks2 , name;
        FileReader file= new FileReader("marks.dat");
        BufferedReader fileInput= new BufferedReader (file); 
        String txt,stxt; int i=0; 
        //while ((txt=fileInput.readLine()) !=null&&((stxt=fileInput.readLine())!=null)) 
        do
        {
            name = fileInput.readLine();
            rollno= fileInput.readLine();
            marks=Integer.parseInt(fileInput.readLine());
            marks1=fileInput.readLine();
            marks2=fileInput.readLine();
            System.out.print("Name " +": " +name); 
            System.out.println("   roll no " +": " +rollno); 
            System.out.print("marks 1  :"+ marks);
            System.out.print("  marks 2 :"+ marks1);
            System.out.println("  marks 3"+marks2);
             int total=(int)marks+(int)marks1+(int)marks2;
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
        } while(fileInput.readLine()!= null);
        fileInput.close();
    }
}