package others;

import java.util.*;
class V1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Name :");
        String name = in.nextLine();
        System.out.print("Address :");
        String add = in.nextLine();
        System.out.print("Amount of Purchase :");
        int a = in.nextInt();
        System.out.println("Choose an Option:");
        System.out.println("'L' for Laptop.");
        System.out.println("'D' for Desktop.");
        char ch = in.next().charAt(0);
        double d=0.0;
        switch(ch) {
            case 'L':
            if(a<=25000) {
                d=0.0;
            }
            else if(a<=57000) {
                d=0.05*a;
            }
            else if(a<=100000) {
                d=0.75*a;
            }
            else {
                d=0.1*a;
            }
            break;
            case 'D':
            if(a<=25000) {
                d=0.05*a;
            }
            else if(a<=57000) {
                d=0.75*a;
            }
            else if(a<=100000) {
                d=0.1*a;
            }
            else {
                d=0.15*a;
            }
            break;
            default:
            System.out.println("Wrong Choice!!");
        }
        System.out.println("Name :"+name);
        System.out.println("Address :"+add);
        System.out.println("Discount :"+d);
        System.out.println("Net Amount :"+(a-d));
    }
}