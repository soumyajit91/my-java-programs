import java.util.*; 
class Calendar
 {
     public void dee()  //dee() function
     {
         int i,count=0,b,d=1; 
         Scanner sc=new Scanner(System.in); 
         System.out.println("Enter month"); //accepting month and year
         int month=sc.nextInt();
         System.out.println("Enter Year");
         int year=sc.nextInt();
         /* Computing and displaying calendar*/
         String w="SMTWTFS";
         int days[]={31,28,31,30,31,30,31,31,30,31,30,31}; 
         String month1[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
         if((year%100==0 && year%400==0) || (year%100!=0 && year%4==0))
         days[1]=29;
         System.out.println("================The Calendar of"+month1[month-1]+" "+year+"is==================");
         for(i=0;i<w.length();i++) System.out.print(w.charAt(i)+"\t"); 
         System.out.println(" "); 
         for(i=1;i<year;i++) 
         if((year%100==0 && year%400==0) || (year%100!=0 && year%4==0))
         count+=2; 
         else
         count+=1;
         for(i=0;i<month;i++) 
         count+=days[i]; 
         count+=1; count%=7; b=7-count;
         if(b!=1 || b!=7) while(count>0)
         {System.out.print(' '+"\t"); 
             count--; 
            }
            for(i=1;i<7;i++) 
             {
                 while(b>0 && d<=days[month-1]) 
                 {
                     System.out.print(d+"\t"); d++; b--; 
                    }
                    b=7;
                    System.out.println(" "); 
                }
            }
        }
                    
                    