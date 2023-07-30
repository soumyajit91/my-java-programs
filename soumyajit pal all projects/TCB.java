import java.io.*;
class TCB
  {
      public static void main()
      {
          BufferedReader in=null;
          String lineIn;
          for(int i=0; i<5;i++)
          {
              try
              {
                  in= new BufferedReader(new FileReader("Student.txt"));
                  if( i<4) break;
                  while ((lineIn = in.readLine())!= null)
                  System.out.println(lineIn);
                }
                 catch (Exception e)            
                  {
                    System.out.println("Exception occured");
                }
              finally
              {
                  System.out.println(" Value in loop is:"+i);
                  try
                  {
                      in.close();
                    }
                  catch (Exception e2)
                  {
                    }
                }
            }
        }
    }
    



    