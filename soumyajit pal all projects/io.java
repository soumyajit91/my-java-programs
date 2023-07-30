import java.io.*;
class io {

  static void main() throws IOException
  {

   BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
   FileWriter fw= new FileWriter ("Student.txt"); 
   BufferedWriter bw = new BufferedWriter (fw);
   PrintWriter outFile = new PrintWriter (bw);
   try
   {
     for (int i=0;i<5; i++) 
   {
     System.out.println("Enter Name");
     String name= br.readLine();
    outFile.println(name); 
   }
 }
  catch(IOException name)
  {
      System.err.println(name);
    }
}
}