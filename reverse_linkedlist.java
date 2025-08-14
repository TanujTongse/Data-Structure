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
   static Node reverse(Node head)
   {
       if(head==null || head.next==null)
       {
           return head;
       }
       Node rest=reverse(head.next);
       head.next.next=head;
       head.next=null;
       return rest;
   } 
   static void print(Node node)
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
      System.out.println("Enter the Number of Nodes:");
      int n=s.nextInt();
      if(n<=0)
      {
         System.out.println("Linked List is Empty");
      }
      System.out.println("Enter Data For Node 1 ");
      int data=s.nextInt();
      Node head=new Node(data);
      Node current=head;
      for(int i=2;i<=n;i++)
      {
          System.out.println("Enter Data For Node 2 "+i);
          data=s.nextInt();
          current.next=new Node(data);
          current=current.next;
      }
      System.out.println("Linked List is:");
      print(head);
      head=reverse(head);
      System.out.println("Reverse Linked List is:");
      print(head);
   }
}