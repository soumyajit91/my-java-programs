package array;
import java.util.*;
import java.io.*;

class stack{
    int data[]=new int[100];
    int stack_size;
    int top;
    public stack(int size){
        stack_size = size ;
        top = -1;
    }
    public void push(int n){
        if(top+1 == stack_size){
            System.out.println("Overflow");    
        }
        else{
        top++;
        data[top]=n;
     System.out.println("Pushed");    
    }
    }
    public int pop(){
        int popped_el;
        if (top == -1){
            System.out.println("Underflow");
        }
        else{
            popped_el = data[top];
            top--;
            System.out.println("Popped");
            return popped_el;
        }
        return -1;
    }
    public void display(){
        int i;
        if (top == -1){
            System.out.println("Underflow");
        }
        else{
            System.out.println("The elements of stack are : ");
            for(i=0;i<=top;i++){
                System.out.print(data[i]+" ");
            }
        }
        System.out.println();
    }
}


public class Untitled {    
    
    static void clrscr(){
        int i = 0;
        while(i!=10){
            System.out.println();
            i++;
        }
    }
    public static void main(String args[])
    { 
        clrscr();
        stack stack1 = new stack(5);
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack1.display();
        stack1.push(6);
        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.pop();
    }   
}