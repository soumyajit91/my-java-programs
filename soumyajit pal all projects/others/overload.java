package others;
class overload
     {
         int area(int s)
         {
             int n=s*s;
             return n;
            }
            double area (double l,double b)
            {
                double n=l*b;
                return n;
            }
            double area(double r)
            {
                double n=(22/7)*(r*r);
                return n;
            }
            public static void main(int a,double l,double b,double r)
            {
                overload ob=new overload();
                int d=ob.area(a);
                double f=ob.area(l,b);
                double c=ob.area(r);
                System.out.println("area of square is"+d);
                System.out.println("area of rectangle is"+f);
                System.out.println("area of circle is"+c);
            }
        }