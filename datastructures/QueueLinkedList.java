
package datastructures;
import java.util.*;
public class QueueLinkedList {
     static class QueueList
    {
        Node front = null;
        Node rear = null;
        
        int size;
        QueueList()
        {
            size=0;
        }
        class Node{
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
        if(front==null)
        {
            return true;
        }
        else
        {
        return false;    
        }
        
    }
    
    public void enqueue(int d)
    {
        Node nnew = new Node(d);
        if(isempty())
        {
            front=nnew;
            rear=nnew;
            size+=1;
        }
        else
        {
            rear.next=nnew;      
            rear=nnew;
            size+=1;
        }
        
    }
    
    public void dequeue()
    {
        Node temp;
        if(isempty())
        {
            System.out.println("Underflow");
        }
        else
        {
            temp=front.next;
            front=temp;
            size-=1;
        }
        
    }
    public int front()
    {
        
        if(isempty())
        {
            //System.out.println("Underflow");
            return -1;
        }
        else
        {
            //System.out.println(front.data);
            return front.data;
        }
    }
    public int rear()
    {
        if(isempty())
        {
            System.out.println("Underflow");
            return -1;
        }
        else
        {
            //System.out.println(rear.data);
            return rear.data;
        }
    }
    public void print()
    {
        Node temp=front;
        if(size==0)
        {
            System.out.println("Underflow");
        }
        else
        {
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
    
        }    
        }
        
        System.out.println();
    }
    
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            QueueList ql = new QueueList();
            ql.enqueue(5);
            ql.enqueue(10);
            ql.enqueue(15);
            System.out.println(ql.front());
            
            ql.dequeue();
            System.out.println(ql.front());
//            ql.dequeue();
//            ql.dequeue();
//            
//            System.out.println(ql.isempty());
//            ql.print();
//            ql.front();
//            ql.rear();
            
            
            
    }
}
