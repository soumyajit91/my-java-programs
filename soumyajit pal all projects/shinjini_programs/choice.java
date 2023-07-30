package shinjini_programs;

import java.io.*;
class choice {
void num_cal(int num, char ch){
if(ch=='s')
System.out.println("square of the number="+(num*num));
else
System.out.println("cube of number="+(num*num*num));
}
void num_cal(int a , int b, char ch){
if(ch=='p')
System.out.println("product of the arguments ="+(a *b));
else
System.out.println("sum of the arguments ="+(a + b));
}
void num_cal(String str1, String str2){
if(str1.equals(str2))
System.out.println("two strings are equal");
else
System.out.println("two strings are not equal");
}
}