package array;
import java.util.*;
class combineSchool
      {
          int com[];
          int size;
          combineSchool(int nn)
          {
          size= nn;
          com= new int[size];
        }
        void inputarray()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter array");
            for(int i=0;i<size;i++)
            {
                com[i]=sc.nextInt();
            }
        }
        void sort()
        {
            int t;
           for(int i=0;i<(size-1);i++)
           {
               if(com[i]>com[i+1])
               {
                   t=com[i];
                   com[i]=com[i+1];
                   com[i]=t;
                }
            }
        }
         void mix(combineSchool a ,combineSchool  b)
         {
             int index=0;
             for(int i=0;i<a.size;i++)
             {
                 com[index++]=a.com[i];
                }
                 for(int j=0;j<b.size;j++)
                 {
                     com[index++]=b.com[j];
                    }
                }
            
            void display()
            {
                for(int i=0;i<size;i++)
                {
                    System.out.println(com[i]+"\n");
                }
            }
          public static void main()
          {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the aize of first array");
              int nn=sc.nextInt();
              System.out.println("Enter SizSchoole of second array");
              int n=sc.nextInt();
              int A[] = new int[nn];
              int B[]= new int[n];
              combineSchool ob1 = new combineSchool(nn);
              combineSchool ob2=new combineSchool(n);
              combineSchool ob3= new combineSchool(nn+n);
               ob1.inputarray();
               ob2.inputarray();
               System.out.println("the first array u have entered is");
               ob1.display();
               System.out.println("the third array u have entered is");
               ob2.display();
               ob3.mix(ob1,ob2);
               System.out.println("combined unsorted array");
               ob3.display();
               ob3.sort();
               System.out.println("combined sorted array");
               ob3.display();
            }
        }
               
               
               
               
               