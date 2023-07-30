package computer_project;

import java.util.*;
class projectDate
{
    private static int y2,m2,d2;
    // a function to check if a year is leap year or not 
    private static boolean isLeapYear(int y)
    {
        if((y%4==0&&y%100!=0)||y%400==0)
            return true;
        else
            return false;
    }
    // S function to calculate the number of days present in the current year      
    // before the current date ,including the cureent date
    private static int getDaysinYear(int d,int m,int y)
    {
        int r=d;
        switch(m)
        {
            case 12: r+=30;
            case 11: r+=31;
            case 10: r+=30;
            case  9: r+=31;
            case  8: r+=31;
            case  7: r+=30;
            case  6: r+=31;
            case  5: r+=30;
            case  4: r+=31;
            case  3: r+=isLeapYear(y)?29:28;
            case  2: r+=31;
        }
        return r;
    }
    //A function to add a specific number of days to a date
    private static void setNewDate(int d,int m, int y, int offset)
    {
        offset +=getDaysinYear(d,m,y);
        int remn = isLeapYear(y)?366:365;
        while(offset>remn)
        {
            y++;
            offset-=remn;
            remn=isLeapYear(y)?366:365;
        }
        y2=y;
        int[] days ={31,(isLeapYear(y)?29:28),31,30,31,30,31,31,30,31,30,31};
        int k=0;
        while(offset>0)
        {
            if(offset<=days[k])
            {
                m2=k+1;
                d2=offset;
                offset=0;
            }
            else
                offset-=days[k];
            k++;
        }
    }

    public static void main()
    {
        //taking input from user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter date:\n\t");
        int d=sc.nextInt();
        System.out.print("\tMonth");
        int m=sc.nextInt();
        System.out.println("\tYear");
        int y=sc.nextInt();
        System.out.println("\nEnter number of days to add:");
        int x=sc.nextInt();
        //Calculating new date mand printing it
        setNewDate(d,m,y,x);
        System.out.println("\nNew date:"+d2+"/"+m2+"/"+y2);
    }
}
