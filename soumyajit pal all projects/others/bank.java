package others;

import java.util.*;
class bank
{
    public static void main()
    {
        int i ;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the input amount");
        int n =sc.nextInt();
        int num =n ;
        int arr[]=new int [100],k=0;
        while(num>0)
        {
            int b=num%10;
            arr[k]=b;
            k++;
            num=num/10;
        }
        if((k-1)<5)
        {
        for(i=k-1;i>=0;i--)
        {
            if(arr[i]==1)
                System.out.println("ONE");
            else if (arr[i]==2)
                System.out.println("TWO");
            else if(arr[i]==3)
                System.out.println("THREE");
            else if(arr[i]==4)
                System.out.println("FOUR");
            else if(arr[i]==5)
                System.out.println("FIVE");
            else if(arr[i]==6)
                System.out.println("SIX");
            else if(arr[i]==7)
                System.out.println("SEVEN");
            else if(arr[i]==8)
                System.out.println("EIGHT");
            else if(arr[i]==9)
                System.out.println("NINE");
            else if(arr[i]==0)
                System.out.println("ZERO");
        }
        System.out.println("DENOMINATION");
        int n2000=n/2000;
        System.out.println("2000"+"\t" +"x"+"\t"+n2000+"\t"+"="+"\t"+(n2000*2000));
        int n500=(n-(n2000*2000))/500;
        System.out.println("500"+"\t" +"x"+"\t"+n500+"\t"+"="+"\t"+(n500*500));
        int n100=(n-(n2000*2000)-(n500*500))/100;
        System.out.println("100"+"\t" +"x"+"\t"+n100+"\t"+"="+"\t"+(n100*100));
        int n50=(n-(n2000*2000)-(n500*500)-(n100*100))/50; 
        System.out.println("50"+"\t" +"x"+"\t"+n50+"\t"+"="+"\t"+(n50*50)); 
         int n20=(n-(n2000*2000)-(n500*500)-(n100*100)-(n50*50))/20; 
        System.out.println("20"+"\t" +"x"+"\t"+n20+"\t"+"="+"\t"+(n20*20));  
         int n10=(n-(n2000*2000)-(n500*500)-(n100*100)-(n50*50)-(n20*20))/10;
        System.out.println("10"+"\t" +"x"+"\t"+n10+"\t"+"="+"\t"+(n10*10)); 
         int n5=(n-(n2000*2000)-(n500*500)-(n100*100)-(n50*50)-(n20*20)-(n10*10))/5;
         System.out.println("5"+"\t" +"x"+"\t"+n5+"\t"+"="+"\t"+(n5*5));
         int n2=(n-(n2000*2000)-(n500*500)-(n100*100)-(n50*50)-(n20*20)-(n10*10)-(n5*5))/2;
          System.out.println("2"+"\t" +"x"+"\t"+n2+"\t"+"="+"\t"+(n2*2));
         int n1=(n-(n2000*2000)-(n500*500)-(n100*100)-(n50*50)-(n20*20)-(n10*10)-(n5*5)-(n2*2))/1;  
           System.out.println("1"+"\t" +"x"+"\t"+n1+"\t"+"="+"\t"+(n1*1));
          System.out.println("TOTAL"+"\t"+((n2000*2000)+(n500*500)+(n100*100)+(n50*50)+(n20*20)+(n10*10)+(n5*5)+(n2*2)+(n1*n1)) );
          System.out.println("TOTAL NO. OF NOTES "+"\t"+(n2000+n500+n100+n50+n20+n10+n5+n2+n1));
    }
    else
    System.out.println("INVALID NO");
}
}