
package datastructures;
import java.util.*;
public class BinaryTreeLinkedList {
static class BinaryTree{
        Node root;
        
        public BinaryTree()
        {
        }
        public BinaryTree(Node n)
        {
          root=n;
          root.left=null;
          root.right=null;
        }
        static class Node
        {
        int data;
        Node left;
        Node right;
        Node(int d)
        {
            data=d;
            left=null;
            right=null;
        }
        }   
        boolean isempty()
        {
           return root==null;
        }
        public Node delete(int d,Node temp)
        {
            Node nnew=null;
            if(temp==null)
            {
                return temp;
            }
            
            else if(d<temp.data)
                {
                    temp.left=delete(d,temp.left);
                }
                else if(d>temp.data)
                {
                    temp.right=delete(d,temp.right);
                }
                else
                {

                if(temp.left!=null & temp.right!=null)
                {
                    Node max=temp.left;
                    while(max.right!=null)
                    {
                        max=max.right;
                    }
                    temp.data=max.data;
                    temp.left=delete(max.data,temp.left);
                }
                else
                {
                  if(temp.left==null)
                  {
                      return temp.right;
                  }
                  else if(temp.right==null)
                  {
                      return temp.left;
                  }
                }
                
                
                
                }
                
            
            
        return temp;}
        public void insert(int d,Node n)
        {
            Node temp=n;
            Node nnew = new Node(d);
            if(root==null)
            {
                root=nnew;
                
            }
            else
            {
                if(d<temp.data)
            {
                if(temp.left==null)
                {
                   temp.left=nnew; 
                }
                else
                {
                insert(d,temp.left);    
                }
                
            }
                else if(d>temp.data)
                {
                if(temp.right==null)
                {
                   temp.right=nnew; 
                }
                else
                {
                insert(d,temp.right);    
                }
                
                }
                
                else if(d==temp.data)
                {
                System.out.println("Data Already Present in Tree");
                }
            }  
        }
        public void inorderprint(Node n)
        {
            Node temp=n;
            if(temp!=null)
            {
                inorderprint(temp.left);
                System.out.print(temp.data+" ");
                inorderprint(temp.right);
            }
            
        }
        
        public void preorderprint(Node n)
        {
            Node temp=n;
            if(temp!=null)
            {
                System.out.print(temp.data+" ");
                preorderprint(temp.left);
                preorderprint(temp.right);
            }
            
        }
        public void postorderprint(Node n)
        {
            Node temp=n;
            if(temp!=null)
            { 
                postorderprint(temp.left);
                postorderprint(temp.right);
                System.out.print(temp.data+" ");
            }
            
        }
        public void search(int d,Node n)
        {
            Node temp=n;
            if(temp!=null)
            {
                if(d==temp.data)
                {
                    System.out.println(d+" Found");
                }
                else if(d<temp.data)
                {
                    search(d,temp.left);
                }
                else if(d>temp.data)
                {
                    search(d,temp.right);
                }
            }
            else
            {
                System.out.println(d+" Not Found");
            }
        }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BinaryTree bt = new BinaryTree();
        
        for(int i=0;i<9;i++)
        {
            bt.insert(sc.nextInt(), bt.root);
        }
        //bt.search(300,bt.root);
        bt.preorderprint(bt.root);
        bt.delete(5,bt.root);
        System.out.println();
        bt.preorderprint(bt.root);
//        System.out.println();
//        bt.inorderprint(bt.root);
//        System.out.println();
//        bt.postorderprint(bt.root);                
    }
}
