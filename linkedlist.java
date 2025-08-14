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
    static void linked(Node head)
    {
       while(head!=null)
       {
          System.out.print(head.data+" ");
          head=head.next;
       }
          System.out.println(" ");
    }
    public static void main(String tt[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number of Nodes:-");
        int n=s.nextInt();
        if(n<=0)
        {
            System.out.println("List is Empty");
        }
        System.out.println("Enter Data For Node 1 ");
        int data=s.nextInt();
        Node head=new Node(data);
        Node current=head;
        for(int i=2;i<=n;i++)
        {
            System.out.println("Enter Data For Node 2 ");
            data=s.nextInt();
            current.next=new Node(data);
            current=current.next;
        }
        System.out.println("Linked List is:-");
        linked(head);
    }
}


/*
import java.util.Scanner;
class Node
{
    int data;
    Node next;
    Node(int data) 
    {
        this.data = data;
        this.next = null;
    }
}
class Linked
{
    Node head;
    void insert(int data)
    {
        Node n1=new Node(data);
        if(head==null)
        {
           head=n1;
           return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=n1;
    }
    void display()
    {
        if (head == null) 
        {
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
           System.out.print(temp.data+"->");
           temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String tt[])
    {
        Scanner s=new Scanner(System.in);
        Linked l=new Linked();
        System.out.println("Enter the size of array:-");
        int n=s.nextInt();
        System.out.println("Enter "+n+" Elements:-");
        for(int i=0;i<n;i++)
        {
           int data=s.nextInt();
           l.insert(data);
        }
        System.out.println("Linked list:-");
        l.display();
    }
}
*/