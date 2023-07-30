import java.util.*;
class Distance
{
 int m, cm;
 Distance()
 {
 m=0;
 cm=0;
 }
 void accept()
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter Distance in Meter and Centimeter :- ");
 m = sc.nextInt();
 cm = sc.nextInt();
 }
 void add(Distance d1,Distance d2)
 {
 m = d1.m + d2.m;
 cm = d1.cm + d2.cm;
 if(cm>=100)
 {
 m = m + cm/100;
 cm = cm%100;
 }
 }
 void show()
 {
 System.out.println("Distance is "+ m +" Meters and "+cm +" Centimeters");
 }
 public static void main()
 {
 Distance dis1= new Distance();
 Distance dis2= new Distance();
 Distance dis3= new Distance();
 dis1.accept();
 dis2.accept();
 System.out.println("First distance :- ");
 dis1.show();
 System.out.println("Second distance :- ");
 dis2.show();
 dis3.add(dis1,dis2);
 System.out.println("Total distance :- ");
 dis3.show();
 }
}