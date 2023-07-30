import java.io.*;
class Myreader
  {
      public static void main()
      {
          try
          {
              FileReader fileReader = new FileReader("MyFile.java");
              BufferedReader bufferedReader = new  BufferedReade(fileReader);