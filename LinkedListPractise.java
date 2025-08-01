import java.util.*;
public class LinkedListPractise {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      LinkedList list1 = new LinkedList();
      LinkedList list2 = new LinkedList();
      LinkedList result = new LinkedList();
      
      int n1 = 0;
      int n2 = 0;
      
      while(true){
        n1 = sc.nextInt();
        if(n1 != -1){
          list1.insert(n1);
        }else{
          break;
        }
      }
      
      while(true){
        n2 = sc.nextInt();
        if(n2 != -1){
          list2.insert(n2);
        }else{
          break;
        }
      }
      
      Node h1 = list1.getHead();
      Node h2 = list2.getHead();
      
      while(h1 != null || h2 != null){
        if(h1 != null) result.insert(h1.data);
        if(h2 != null) result.insert(h2.data);
        
        h1 = (h1 != null)? h1.next : null;
        h2 = (h2 != null)? h2.next : null;
      }
      
      result.display();
      sc.close();
    }
    
    static class Node{
      int data;
      Node next;
      Node(int data){
        this.data = data;
        this.next = null;
      }
    }
    
    static class LinkedList{
      Node head;
      LinkedList(){
        head = null;
      }
      
      void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
          head = newNode;
        }else{
          Node cur = head;
          while(cur.next != null){
            cur = cur.next;
          }
          cur.next = newNode;
        }
      }
      
      Node getHead(){
        return head;
      }
      
      void display(){
        Node cur = head;
        while(cur != null){
          System.out.print(cur.data+"->");
          cur = cur.next;
        }
      }
    }
}