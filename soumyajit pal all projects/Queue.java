import java.io.*;
import java.util.*;
public class Queue {
    int SIZE = 50;
    int items[] = new int[SIZE];
    int front, rear;    
    Queue() {
        front = -1;
        rear = -1;
    }
    boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        return false;
    }
    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }
    public int getSize()
    {
        return items.length ;
    }
    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        }
        else {
            if (front == -1) {

                front = 0;
            }
            rear++;
            items[rear] = element;
            System.out.println("Insert " + element);
        }
    }
    int deQueue()
    {       
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        }
        else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            }
            else {
                front++;
            }
            System.out.println( element + " Deleted");
            return (element);
        }
    }
    void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        }
        else {
            System.out.println("\nFront index-> " + front);
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + "  ");
            System.out.println("\nRear index-> " + rear);
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        char ch;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("\nStack Operations");
            System.out.println("1. add");
            System.out.println("2. subtract");            
            System.out.println("3. check empty");
            System.out.println("4. check full");
            System.out.println("5. size");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1 : 
                System.out.println("Enter integer element to ass");
                q.enQueue(sc.nextInt());                  
                break;                         
                case 2 : 
                q.deQueue();  
                break;                         
                case 3 :         
                System.out.println("Empty status = " + q.isEmpty());
                break;                         
                case 4 : 
                System.out.println("Full status = " + q.isFull());
                break;                
                case 5 :
                System.out.println("Size = " + q.getSize());
                break;                                                    
                default : 
                System.out.println("Wrong Entry \n ");
                break;
            }
            q.display();            
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = sc.next().charAt(0); 
        } while (ch == 'Y'|| ch == 'y');  
    }
}