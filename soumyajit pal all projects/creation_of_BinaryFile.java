import java.io.*;

class creation_of_BinaryFile
      {
          public static void main() throws IOException
          {
              BufferedReader inp= new BufferedReader(new InputStreamReader(System.in));
              String pname;
              int qty;
              double price;
              FileOutputStream std = new FileOutputStream("invoce.dat");
              DataOutputStream mat = new DataOutputStream(std);
              System.out.println("Input number of products:");
              int n = Integer.parseInt(inp.readLine());
              for(int x=1;x<=n;x++)
               {
                  System.out.println("Input product name:");
                  pname= inp. readLine();
                  System.out.println("Input Quantity :");
                  qty =Integer.parseInt(inp.readLine());
                  System.out.println("Input unit price :  ");
                  price = Double. parseDouble(inp.readLine());                  
                  mat.writeUTF(pname);                                  
                  mat.writeInt(qty);
                  mat.writeDouble(price);                                   
              }
              std.close();
              mat.close();
            }
        }