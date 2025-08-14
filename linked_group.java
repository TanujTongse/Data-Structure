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
    static Node group(Node head,int k)
    {
       Node curr=head;
       Node next=null;
       Node prev=null;
       int count=0;
       while(curr!=null && count<k)
       {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
       }
       if(next!=null)
       {
           head.next=group(next,k);
       }
       return prev;
    }
    static void display(Node node)
    { 
        while(node!=null)
        {
            System.out.println(node.data+" ");
            node=node.next;
        }
    }
    public static void main(String tt[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number of Nodes:-");
        int n=s.nextInt();
        if(n<=0)
        {
            System.out.println("Linked List is Empty");
        }
        System.out.println("Enter the Data For Node 1");
        int data=s.nextInt();
        Node head=new Node(data);
        Node current=head;
        for(int i=2;i<=n;i++)
        {
            System.out.println("Enter the Data For Node "+i);
            data=s.nextInt();
            current.next=new Node(data);
            current=current.next;
        }
        System.out.print("Enter group size k: ");
        int k = s.nextInt();

        System.out.println("\nOriginal Linked List:");
        display(head);

        head = group(head, k);

        System.out.println("Reversed in Groups of " + k + ":");
        display(head);
    }
}