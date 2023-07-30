import java.util.Stack;
import java.util. *;
class Node {
  int data;
  Node next;
 
  Node(int value) {
    data = value;
    next = null;
  }
}
 
public class Palindrome {
  Node head;
 
  // Utility function to insert a node at the last
  public void insertAtLast(int data) {
    // Making a new node
    Node newNode = new Node(data);
    // if this is the first node
    if (head == null) {
      head = newNode;
      return;
    }
    newNode.next = null;
 
    // if it's not the first node, then traverse the
    // complete linked list till the end
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = newNode;
  }
 
  // A utility function to print the linked list
  public void printList(Node head) {
    System.out.println("Printing the linked list");
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
 
    System.out.println();
  }
 
  // Function to check if linked list is palindrome
  public boolean isPalindrome(Node head) {
    Stack<Integer> myStack = new Stack<>();
    Node temp = head;
    boolean status = false;
 
    // Pushing the elements of Linked List to stack
    while (temp != null) {
      myStack.push(temp.data);
      temp = temp.next;
    }
    temp = head;
 
    while (temp != null) {
      int element = myStack.pop();
      if (temp.data == element) {
        status = true;
        temp = temp.next;
      } else {
        status = false;
        break;
      }
    }
 
    return status;
 
  } // isPalindrome function ends here
 
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      Scanner ra=new Scanner(System.in);
    System.out.println("do u want to insert 1-yes or 2-no");
    Palindrome ll = new Palindrome();  
    int s=sc.nextInt();
    while (s==1)
    {
    System.out.println("enter no. to be inserted");
    ll.head = new Node(sc.nextInt());
    System.out.println("do u want to insert yes or no");
    s= ra.nextInt();
}
       
   
    if (ll.isPalindrome(ll.head)) {
      System.out.println("Palindrome Linked List");
    } else {
      System.out.println("Not a Palindrome Linked List");
    }
 
  }
}