package lastbluej;

import java.util.*;
class change
{
    int a[];
    int n;
    final char [] DIGIT_TABLE ={'0','1','2','3','4','5','6','7','8','9','0','A','B','C','D','E','F','G','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    String hexnum;
    public change()
    {
        a= new int[15];
        n=0;
        for(int i=0;i< 15 ;i++)
            a[i]=0;
    }

    public void hexadeci(int n1)
    {
        if(n>0)
        {
            System.out.println("-");
            n1=n-1;
            hexnum="";
        }
        printRecursively (n1);
    }

    private void printRecursively(int n1)
    {
        if(n1>=16)
            printRecursively(n1/16);
        if(hexnum==null)
            System.out.print(DIGIT_TABLE[n1%16]);
        else
            hexnum= hexnum+DIGIT_TABLE[n1%16];
    }

    public void input()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the integer");
        n=sc.nextInt();
        System.out.println();        
    }

    public void decihexa()
    {
        int len = hexnum.length();
        char ch;
        int hexplacevalue=0,hexmul=1;
        long decnum=0;
        int n1=0;int k=0;
        for ( int i =len-1;i>=0;i--)
        {
            ch=hexnum.charAt(i);
            switch (ch)
            {
                case'A':
                n1=10;
                break;
                case'B':
                n1=11;
                break;
                case'C':
                n1=12;
                break;
                case'D':
                n1=13;
                break;
                case'E':
                n1=14;
                break;
                case'F':
                n1=15;
                break;
                default:
                n1=Integer.parseInt(String.valueOf(ch));
                break;               
            }
            if(hexplacevalue==0)
            decnum=decnum*10+1*n1;
            else
            decnum=hexmul*n1+decnum;
            hexmul*=16;
            hexplacevalue++;
        }
        System.out.println(hexnum+"converted back to decimal as"+decnum);
        }
    }
