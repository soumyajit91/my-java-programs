import java.io.*;
class Output_file {

    static void main() throws IOException
    {
        int rno;float marks,marks1,marks2; String str;
        BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
        FileWriter fw= new FileWriter ("marks.dat"); 
        BufferedWriter bw = new BufferedWriter (fw);
        PrintWriter dw= new PrintWriter (bw);
        System.out.println("Enter no.of students ");
        int n=Integer.parseInt(stdin.readLine());
        for (int i=0;i<n; i++) 
        {
            System.out.println("Enter Roll no.");
            rno=Integer.parseInt(stdin.readLine());
            System.out.println("Enter Name of student");
            str=(stdin.readLine());
            System.out.println("Enter Marks1 :");
            marks=Float.parseFloat(stdin.readLine());
            System.out.println("Enter Marks2 :");
            marks1=Float.parseFloat(stdin.readLine());
            System.out.println("Enter Marks3 :");
            marks2=Float.parseFloat(stdin.readLine());
            dw.println(str); 
            dw.println(rno);
            dw.println(marks);
            dw.println(marks1);
            dw.println(marks2);

        }
        dw.close();
        bw.close();
        fw.close();


    }
}
