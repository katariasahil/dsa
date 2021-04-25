package datastructures;
import java.util.*;
public class StackLinkedList {
    static class StackList{
    Node root;
    
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    boolean isempty()
{
   return (root==null);
}
     void push(int d)
     {
         Node nnew = new Node(d);
         if(root==null)
         {
             root=nnew;
         }
         else
         {
         Node temp=root;
         root=nnew;
         nnew.next=temp;
         }
         
     }
     void pop()
     {
         if(root==null)
         {
             System.out.println("Stack Underflow");
         }
         else
         {
             int poppeddata=root.data;
             root=root.next;    
         }
         
     }
     int peek()
{
    if(root==null)
         {
             System.out.println("Stack Underflow");
             return 0;
         }
    else
    {
       return root.data;   
    }
     
    
}   
     int search(int key)
{
    Node n= root;
    if(n==null)
         {
             System.out.println("Stack Underflow");
             return -1;
         }
    
    else
    {
        int temp=0;
        while(n.data!=key)
            {
                if(n.next==null)
                {
                    return -1;
                }
                else
                {
                n=n.next;
                temp+=1;    
                }  
            } 
        return temp;    
        
        
    }
}
     void print()
     {
         Node n= root;
         if(n==null)
         {
             System.out.println("Stack Underflow");
         }
         else
         {
            while(n!=null)
            {
                System.out.print(n.data+" ");
                n=n.next;
            } 
         }
            
            System.out.println();
     }
}
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            StackList sl = new StackList();
            sl.push(5);
            sl.push(10);
            sl.push(15);
            sl.push(20);
            sl.push(25);
            sl.push(30);
            int k=sl.search(30);
            if(k>=0)
            {
          System.out.println("Found at: "+k);      
            }
            else
            {
                System.out.println("Not Found");
            }
            
        }
}
