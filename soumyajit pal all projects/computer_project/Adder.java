package computer_project;

import java.io.*;
class Adder {
int a[];
Adder() {
a = new int[2];
}
void readtime() throws IOException {
InputStreamReader x = new InputStreamReader(System.in);
BufferedReader y = new BufferedReader(x);
System.out.println(" Time");// accepts time 
System.out.println("Enter hour:");
a[0] = Integer.parseInt(y.readLine());
System.out.println("Enter minute :");
a[1] = Integer.parseInt(y.readLine());
}
void addtime(Adder X, Adder Y) {// adds time 
int hour1 = X.a[0];
int min1 = X.a[1];
int hour2 = Y.a[0];
int min2 = Y.a[1];
int hourSum = hour1 + hour2;
int minSum = min1 + min2;
a[0] = hourSum + (minSum/60);
a[1] = minSum%60;
}
void disptime() {// displays time 
System.out.println("Their sum is-");
System.out.println("hours =" + a[0] +" minutes =" + a[1]);
}
public static void main(String args[ ]) throws IOException {
Adder obj1 = new Adder();
Adder obj2 = new Adder();
Adder sumObj = new Adder();
obj1.readtime();
obj2.readtime();
sumObj.addtime(obj1, obj2);
sumObj.disptime();
}
}

