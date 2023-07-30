package computer_project;

import java.util.*; 
class SpiralMatrix 
{public static void main()//main function 
{
int a[][],r,c,k1=2,k2=3,p=0,co=0,re=0; 
Scanner sc=new Scanner (System.in);
System.out.println("enter the dimension of matrix A x A ="); 
int l =sc.nextInt(); //accepting dimension of square spiral matrix
 a=new int[l][l];
 r=l/2;
c=r-1;
 if(l%2==0)
 {
System.out.println("wrong entry for spiral path"); 
System.exit(0);
 } 
/*Calculating and displaying spiral matrix*/
 while(p!=(int)Math.pow(l,2))
 {
if(co!=0)
 re=1;
for(int ri=1;ri<=k1-re;ri++)
 {
p++;
c++;
if(c==l)
break;
a[r][c]=p;
} 
if(c==l)
break;
 for(int dw=1;dw<=k1-1;dw++)
 {
p++;
r++;
a[r][c]=p;
}
 for(int le=1;le<=k2-1;le++)
 {
p++;
c--;
a[r][c]=p;
}
 for(int up=1;up<=k2-1;up++)
 {
p++;
r--;
a[r][c]=p;
}
 k1=k1+2;
 k2=k2+2;
 co++;
 }
for(int y=0;y<l;y++) //Displaying matrix 
{
for(int yy=0;yy<l;yy++)
 System.out.print("\t"+a[y][yy]);
 System.out.println();
 System.out.println();
 }
}
}
