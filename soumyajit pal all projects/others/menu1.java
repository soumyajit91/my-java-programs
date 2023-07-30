package others;

import java.util.*;
class menu1
        {
            public static void main()
            {
                Scanner sc=new Scanner(System.in);
                int c,s,a,b,m,n,p;
                double k,area=0;
                System.out.println("1.Area of Equilateral Triangle");
                System.out.println("2.Area of an isosceles Triangle");
                System.out.println("3.area of Scalene Triangle");
                System.out.println("Enter your choice");
                c=sc.nextInt();
                switch(c)
                {
                    case 1 :
                    System.out.println("enter the side of equilateral triangle");
                    s=sc.nextInt();
                    area=(Math.sqrt(3)*s*s)/4.0;
                    System.out.println("Area="+area);
                    break;
                    case 2:
                    System.out.println("enter side & base of isoceles Triangle");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    area=b/4.0*(Math.sqrt(4*a*a-b*b));
                    System.out.println("Area="+area);
                    break;
                    case 3:
                    System.out.println("enter sides of scalene triangle");
                    m=sc.nextInt();
                    n=sc.nextInt();
                    p=sc.nextInt();
                    k=(m+n+p)/2.0;
                    area=Math.sqrt(k*(k-m)*(k-n)*(k-p));
                    break;
                    default:
                    System.out.println("wrong choice!!");
                }
            }
        }
        