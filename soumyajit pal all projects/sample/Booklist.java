package sample;



public class Booklist extends Author
{
   long bookno;
   String bookname;
   float price;
   int edition;
   Booklist(String n,String s,long b,String bn,float p, int e)
   {
       super(n,s);
       bookno=b;
       bookname=bn;
       price=p;
       edition=e;
    }
   void show()
   {
      super.show();
      System.out.println(" enter book no.:"+bookno);
      System.out.println("enter book name:"+bookname);
      System.out.println("Enter price of the book"+price);
      System.out.println("Enter edition of the book"+edition);
    }
}