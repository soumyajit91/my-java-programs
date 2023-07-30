import java.io.*;
class tE1
  {
      public static void main()throws IOException
      {
          FileReader file= new FileReader("Student.txt");
          StreamTokenizer inputStream = new StreamTokenizer(file);
          int tokenType=0;
          int numberoftokens=-1;
          do
          {
              tokenType = inputStream.nextToken();
              output(tokenType,inputStream);
              numberoftokens++;
            }
          while(tokenType!= StreamTokenizer.TT_EOF);
          System.out.println("Number of tokens= "+ numberoftokens);
        }
      static void output(int ttype, StreamTokenizer inStream) 
        {
         switch(ttype)
             {
               case StreamTokenizer.TT_EOF : System.out.println("TT_EOF");
                break;
               case StreamTokenizer.TT_EOL:System.out.println("TT_EOL");
                break;
                case StreamTokenizer.TT_NUMBER:System.out.println("TT_NUMBER :nval="+inStream.nval);
                break;
                case StreamTokenizer.TT_WORD: System.out.println("TT_word:sval="+ inStream.sval);
                break;
                default: System.out.println("Unknown: nval= " +inStream.nval +" sval="+inStream.sval);
            }
        }
    } 