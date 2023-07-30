package others;
import java.util.*;
class Library
     {
         String name,author;
         double pric,total_amt;
         int d,r;
         Library()
         {
             name=" ";
             author=" ";
             pric=0.0;
             total_amt=0.0;
             d=0;
             r=0;
            }
         void accept()
         {
             Scanner sc=new Scanner(System.in);
             System.out.println("enter the name of the book");
             name=sc.nextLine();
             System.out.println("enter authors name");
             author=sc.nextLine();
             System.out.println("enter the cost of the book");
             pric=sc.nextDouble();
             System.out.println("enter the number of days taken to return book ");
             d=sc.nextInt();
            }
         void compute()
         {
             if(d<7)
             {
                 r=0;
                }
                 else if(d<=12)
                 {
                    r=2*(d-7);
                }
                else if(d<=17)
                {
                    r=(2*5)+(3*(d-12));
                }
                else if(d>17)
                {
                    r=(2*5)+(3*5)+(5*(d-17));
                }
                total_amt=(0.02*pric)+r;
            }
         void show()
         {
             System.out.println("the name of the book is  "+name+"by  "+author);
             System.out.println("the price of the book is   "+pric);
             System.out.println("the fine calculated    "+r );
             System.out.println("the total amount paid will be"+total_amt);
            }
         public static void main()
         {
              Library ob =new Library();
             ob.accept();
             ob.compute();
             ob.show();
             
            }
        }