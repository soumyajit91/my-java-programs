package others;
class tower_of_hanoi
{
    static void towerofhanoi(int n, char fromrod,char torod, char auxrod)
    {
        if (n == 0)
        {
            return;
        }
        towerofhanoi(n - 1, fromrod, auxrod, torod);
        System.out.println("Move disk "+ n + " from rod " +fromrod +" to rod " + torod );
        towerofhanoi(n - 1, auxrod, torod, fromrod);
    }

    public static void  main(String args[])
    {
        int n = 3; 
        towerofhanoi(n, 'A', 'C', 'B');
    }
}