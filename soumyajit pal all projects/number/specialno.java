package number;
class specialno
   {
       public static void main()
       {
            System.out.println("the special no. are ");
           int num,i,d,c=0,s=0,s1=0;
           for( i=100;i<=9999;i++)
           {
               num=i;
               while(num!=0)
               {
                   d=num%10;
                   if(c!=0&&num>9)
                   {
                       s+=d;
                    }
                    c++;
                    num=num/10;
                }
               s1=(i%10)+(i/(int)Math.pow(10,c-1));
               c=0;
               if(s1==s)
               System.out.print(i+" ");
               s=0;
            }
        }
    }