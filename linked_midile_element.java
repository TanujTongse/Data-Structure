//Find Middle of the Linked List

import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int x)
    {
        this.data=x;
        this.next=null;
    }
}
class Demo
{
    static int midile(Node head)
    {
        Node fptr=head;
        Node sptr=head;
        while(fptr!=null && fptr.next!=null)
        {
            fptr=fptr.next.next;
            sptr=sptr.next;
        }
        return sptr.data;
    }
    public static void main(String tt[])
    {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the Number of Nodes:-");
       int n=s.nextInt();
       if(n<=0)
       {
          System.out.print("Linked List is Empty");
       }  
       System.out.println("Enter Data For Node 1 ");
       int data=s.nextInt();
       Node head=new Node(data);
       Node current=head;
       for(int i=2;i<=n;i++)
       {
           System.out.println("Enter Data For Node "+i+" ");
           data=s.nextInt();
           current.next=new Node(data);
           current=current.next;
       }
       System.out.println("Midile Element of Linked List is "+midile(head));
    }
}

/*
Time Complexity: O(n), where n is the number of nodes in the linked list.
Auxiliary Space: O(1)
*/