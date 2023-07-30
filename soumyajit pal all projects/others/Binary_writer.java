package others;


import java.io.*;

class Binary_writer
      {
          public static void main() throws IOException
          {
              BufferedReader inp= new BufferedReader(new InputStreamReader(System.in));
              String pname;
              int qty;
              double price;
              FileOutputStream std = new FileOutputStream("info.dat");
              DataOutputStream mat = new DataOutputStream(std);
              System.out.println("Input number of people u want to write taxable income:");
              int n = Integer.parseInt(inp.readLine());
               String name;Double amount;
              for(int x=1;x<=n;x++)
               {
                   System.out.println("Enter the name of the person whoes taxable incime will be written");
                   name=inp. readLine();
                   System.out.println("Enter the taxable income");
                   amount=Double. parseDouble(inp.readLine());
                    mat.writeUTF(name);    
                    mat.writeDouble(amount); 
                      }
              std.close();
              mat.close();
            }
        }