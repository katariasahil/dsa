package datastructures;
import java.util.*;

public class QueueArray {
    int capacity,size,front,rear;
    int a[];
    
    QueueArray(int c)
    {
        capacity=c;
        a = new int[capacity];
        front =0;
        rear=capacity-1;
        size=0;
    }
    boolean isempty()
    {
        if(size==0)
        {
            return true;
        }
        else
        {
        return false;    
        }
        
    }
    boolean isfull()
    {
        if(size==capacity)
        {
            return true;
        }
        else
        {
        return false;    
        }
            
    }
    void enqueue(int d)
    {
        if(isfull())
    {
        System.out.println("Stack Overflow");
    }
    else 
    {
        rear=(rear+1)%capacity;
        a[rear]=d;
        size+=1;
    }
    }
    void dequeue()
    {
        if(isempty())
    {
        System.out.println("Stack Underflow");
        
    }
    else 
    {
        int temp = a[front];
        front = (front+1)%capacity;
        size-=1;
    }
    }
    void front()
    {if(isempty())
    {
        System.out.println("Stack Underflow");
        
    }
    else
    {
        System.out.println(a[front]);
    }
        
        
    }
    void rear()
    {if(isempty())
    {
        System.out.println("Stack Underflow");
        
    }
    else
    {
        System.out.println(a[rear]);
    }
        
        
    }
    void print()
    {
        int temp=0;
        int fr=front;
        if(isempty())
    {
        System.out.println("Stack Underflow");
        
    }
        else
        {
            
        while(temp!=size)
        {
            System.out.print(this.a[(fr%capacity)]+" ");
            temp+=1;
            fr+=1;
        }
        }
        System.out.println();
    }
    
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueArray q = new QueueArray(15);
        
        for(int i=1;i<17;i++)
        {
        q.enqueue(i);    
        }
        q.print();
        
        q.dequeue();
        q.dequeue();
        q.dequeue();
       
         
        q.print();
        
         q.enqueue(20);
         q.enqueue(21);
         q.enqueue(22);

      
        q.print();
        
    }
}
