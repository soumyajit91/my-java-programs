package computer_project;

import java.util.*;
import java.io.*;
class queue{
    int data[]=new int[100];
    int queue_size;
    int front,end;
    public queue(int size){
        queue_size = size ;
        front = 0;
        end=-1;
    }
    public void push(int n){// pushes the element in the queue 
        if(end+1 ==queue_size){
            System.out.println("Overflow");    
        }
        else{
        end++;
        data[end]=n;
     System.out.println("Pushed");    
    }
    }
    public int pop(){
        int popped_el;
        if (front > end){
            System.out.println("Underflow");
        }
        else{
            popped_el = data[front];
            front++;
            System.out.println("Popped");
            return popped_el;
        }
        return -1;
    }
    public void display(){
        int i;
        if (front > end){
            System.out.println("Underflow");
        }
        else{
            System.out.println("The elements of stack are : ");
            for(i=front;i<=end;i++){
                System.out.print(data[i]+" ");
            }
        }
        System.out.println();
    }
}
public class Untitled {    
    
    public static void main(String args[])
    { 
        
      Scanner scan = new Scanner(System.in);        
        System.out.println("Stack Test\n");
        System.out.println("Enter Size of Integer queue ");
        int n = scan.nextInt();
        /* Creating object of class */
        queue stk = new queue(n);
        /* Perform Stack Operations for class queue */
        char ch;
        do{
            System.out.println("\nStack Operations");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. display");
           
            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to push");
                try 
                {
                    stk.push( scan.nextInt() );
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }                         
                break;                         
            case 2 : 
                try
                {
                    System.out.println("Popped Element = " + stk.pop());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;                         
            case 3 :         
                   System.out.println("the array is");
                   stk.display();
                   break;
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }
            /* display queue*/
            stk.display();            
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
 
        } while (ch == 'Y'|| ch == 'y');   
       
    } 
}
