
import java.util.*;
class Stack {
  private int arr[];
  private int top; 
  private int capacity;  
  Stack(int size) {    
    arr = new int[size];
    capacity = size;
    top = -1;
  }
  public void push(int x) {
    if (isFull()) {
      System.out.println("Stack OverFlow");    
      System.exit(1);
    }
    System.out.println("Inserting " + x);
    arr[++top] = x;
  }
  public int pop() {
    if (isEmpty()) {
      System.out.println("STACK EMPTY");     
      System.exit(1);
    }
    return arr[top--];
  }
  public int getSize() {
    return top + 1;
  }
  public Boolean isEmpty() {
    return top == -1;
  }
  public Boolean isFull() {
    return top == capacity - 1;
  }
  public void printStack() {
    for (int i = 0; i <= top; i++) {
      System.out.print(arr[i] + ", ");
    }
  }
  public static void main(String[] args) {
    Stack stack = new Stack(50);
    int i=1,k=0;
    Scanner sc= new Scanner(System.in);
    while (k!=1)
    {
       System.out.println("Enter a number");
       int n =sc.nextInt();
       stack.push(n);
       System.out.println("Enter 1 to stop "); 
       k=sc.nextInt();
    }           
    System.out.print("Stack: ");
    stack.printStack();
    System.out.println("Enter the  no. of variable to remove");
    int n1=sc.nextInt();
    for(i=0;i<n1;i++)
    stack.pop();
    System.out.println("\nAfter popping out");
    stack.printStack();

  }
}