package lastbluej;

import java.util.*;
class passwordMaker
   {
       public static void main()
       {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter first name:");
         String firstName =sc.nextLine();
         System.out.println("Enter middle name:");
         String middleName= sc.nextLine();
         System.out.println("Enter last name:");
         String lastname=sc.nextLine();
         System.out.println("Enter age:");
         int age =sc.nextInt();
         int len1=0,len2=0,len3=0;
         len1=firstName.length();
         len2=middleName.length();
         len3=lastname.length();
         String int1=firstName.substring(0,1)+firstName.substring(len1-1,len1);
         String int2=middleName.substring(0,1)+middleName.substring(len2-1,len2);
         String int3=lastname.substring(0,1)+lastname.substring(len3-1,len3);
         String password=int3+(age/10)+int1+ (age%10)+int2;
         System.out.println("your password ="+password);
        }
    }