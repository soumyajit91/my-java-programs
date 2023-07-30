package computer_project;

import java.io.*;
 class Reading_file
 {
    static void main() throws IOException
    {
       FileReader file= new FileReader("Student.txt");// call the text file 
       BufferedReader fileInput= new BufferedReader (file); 
       String txt; int i=0; 
       while ((txt=fileInput.readLine()) !=null) // stores names from file 
       {
       System.out.println("Name" +i+": " +txt); 
    }
    fileInput.close();
}
}
