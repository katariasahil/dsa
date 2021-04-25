package datastructures;
import java.util.*;
public class StackArray {
 static final int max = 1000;
 int top;
int[] a = new int[max];
StackArray()
{
    top=-1;
}
boolean push(int d)
{
    if(top>=max-1)
    {
        System.out.println("Stack Overflow");
        return false;
    }
    else 
    {
        a[++top]=d;
        System.out.println(d/*+"Pushed into stack"*/);
        return true;
    }
}
boolean isempty()
{
   return (top<0);
}
void pop()
{
    if(top<0)
    {
        System.out.println("Stack Underflow");
        //return false;
    }
    else
    {
        int d=a[top--];
        System.out.println(d+" Popped from stack");
        //return true;
    }
}
int peek()
{
    if(top<0)
    {
        System.out.println("Stack Underflow");
        return -1;
    }
    else
    {
        int d=a[top];
        return d;   
    }
     
    
}
void print()
{
    int temp=top;
    if(temp<0)
    {
        System.out.println("Stack Underflow");
    }
    else
    {
        while(temp>=0)
    {
        System.out.print(a[temp]+" ");
        temp--;
        
    }
        
        
    }
    
    System.out.println();
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackArray s = new StackArray();
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        s.print();
        

    }
}
