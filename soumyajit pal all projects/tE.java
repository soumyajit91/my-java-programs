
import java.io.*;
class tE
 {
     public static void main()throws IOException
     {
         FileReader file = new FileReader("Student.txt");
         StreamTokenizer inputStream = new StreamTokenizer(file);
         int tokentype =0;
         int numberofTokens=-1;
         do
         {
             tokentype = inputStream.nextToken();
             numberofTokens++;
            }
            while (tokentype != StreamTokenizer.TT_EOF);
             System.out.println("Number of token "+ numberofTokens);
            }
        }