package computer_project;

import java.io.*;
class Output_file {

  static void main() throws IOException
  {

   BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
   FileWriter fw= new FileWriter ("Student.txt"); 
   BufferedWriter bw = new BufferedWriter (fw);
   PrintWriter outFile = new PrintWriter (bw);
   for (int i=0;i<5; i++) 
   {
     System.out.println("Enter Name");
     String name= br.readLine();
    outFile.println(name); 
   }
    outFile.close();
    bw.close();
    fw.close();
 }
}
