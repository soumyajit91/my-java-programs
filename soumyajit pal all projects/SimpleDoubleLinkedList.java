import java.util.*;
public class SimpleDoubleLinkedList
{
    static int count =0;
    Elem2 front = null;
    Elem2 back = null;
    public int ReadMe()
    {
        Scanner sc = new Scanner (System.in);
        while(sc.hasNextInt())
        {
            int val =sc.nextInt();
            Elem2 back= null;
            e.data =val;
            e.position = ++count;
            if(front == null)
            {
                front = e;
            }
            else
            {
                back.next=e;
            }
            e.prev = back;
            back=e;
        }
        System.out.println("list read over!");
        return count;
    }
    public int getArrayElement(int a)
    {
        boolean found = false;
        int val=0;
        int i=0;
        Elem2 e;
        if(a<0)
        val=-8888;
        if(a==0)
        {
         if(front != null) 
         val =front.data;
        }
        else
        {
            for(e= front; i<a&&e!= null; e= e.next, i++)
            if(i==a&& e!= null)
        
            
            
            
                