package lastbluej;

import java.util.*;
class Towerofhanoi
   {
       public static void main()
       {
           Scanner sc=new Scanner(System.in);
           char start ='L',inter='C',dest='R';
           System.out.println("Enter a number");
           int N=sc.nextInt();
           Towerofhanoi ob= new Towerofhanoi();
           ob.move(N,start,inter,dest);
        }
       void move(int N,char snd1,char ind1, char dndi)
           {
           if(N!=0)
            {
                move(N-1,snd1,dndi,ind1); 
                System.out.println("\n move disk "+N+"from"+snd1+"to"+dndi);
                move(N-1,ind1,snd1,dndi);
            }
           return;
        }
    } 