package sample;

public class Area extends Author
{
   double h,area;
   Area(double c,double d,double he)
   {
   super(c,d);
   h=he;
   }
   void doarea()
   {
       area= b*h;
    }
   void show()
   {
       super.show();
       System.out.println("the height of parrallelogram:-"+h);
       System.out.println("the area of parrallelogram:-"+area);
    }
}