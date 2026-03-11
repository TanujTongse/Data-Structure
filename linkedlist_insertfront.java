import java.util.*;
class Node
{
   int data;
   Node next;
   Node(int data)
   {
      this.data=data;
      this.next=null;
   }
}
class Tanuj
{
   static Node insertfront(Node head,int v)
   {
      Node newnode=new Node(v);
      newnode.next=head;
      return newnode;
   }
   static void printlist(Node head)
   {
      Node curr=head;
      while(curr!=null)
      {
         System.out.print(curr.data);
         if(curr.next!=null)
         {
            System.out.print(" -> ");
         }
         curr=curr.next;
      }
   }
   public static void main(String tt[])
   {
      Scanner s=new Scanner(System.in);
      System.out.println("Ennter the Number of Nodes:-");
      int n=s.nextInt();
      if(n<=0)
      {
          System.out.println("Linked List is Empty");
      }
      System.out.println("Enter the Data Node 1:");
      int data=s.nextInt();
      Node head=new Node(data);
      Node curr=head;
      for(int i=2;i<=n;i++)
      {
          System.out.println("Enter the Data Node "+i);
          data=s.nextInt();
          curr.next=new Node(data);
          curr=curr.next;
      }
      System.out.println("Linked List is:-");
      printlist(head);
      System.out.println("\n");
      System.out.println("Enter the Data in Front of Linked List is:-");
      int v=s.nextInt();
      System.out.println("After Inserting Data in Front Linked List is:-");
      head=insertfront(head,v);
      printlist(head);
   }
}