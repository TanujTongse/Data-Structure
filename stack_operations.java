import java.util.*;
class Stack
{
   int ary[],top,size;
   Stack(int size)
   {
      this.size=size;
      ary=new int[size];
      top=-1; 
   }
   void push(int value)
   {
      if(top==size-1)
      {
         System.out.println("Stack is Overflow can't Push Elements");
      }
      else
      {
          ary[++top]=value;
          System.out.println(value+" push into stack");
      }
   }
   void pop()
   {
      if(top==-1)
      {
         System.out.println("Stack is Underflow can't Pop Element");
      }
      else
      {
         System.out.println(ary[top--]+" pop into stack");
      }
   }
   void peek()
   {
      if(top==-1)
      {
         System.out.println("Stack is Empty");
      }
      else
      {
         System.out.println("Top Element of Stack "+ary[top]);
      }
   }
   void display()
   {
      if(top==-1)
      {
         System.out.println("Stack is Empty");
      } 
      else
      {
         for(int i=top;i>=0;i--)
         {
            System.out.println(ary[i]+" ");
         }
            System.out.println();
      }
   }
}
class Demo
{
   public static void main(String tt[])
   {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the size of stack:-");
       int n=s.nextInt();
       Stack stack=new Stack(n);
       int c;
       do
       {
           System.out.println("<<<<<Stack>>>>>");
           System.out.println("1. PUSH");
           System.out.println("2. POP");
           System.out.println("3. PEEK");
           System.out.println("4. DISPLAY");
           System.out.println("5. EXIT.");
           System.out.println("Enter the Choise:-");
           c=s.nextInt();
           switch(c)
           {
               case 1:
                   System.out.println("Enter the Value:-");
                   int value=s.nextInt();
                   stack.push(value);
                   break;
               case 2:
                   stack.pop();
                   break;
               case 3:
                   stack.peek();
                   break;
               case 4:
                   stack.display();
                   break;
               case 5:
                   System.out.println("Exit");
                   break;
               default:
                   System.out.println("Invalid Choise");
           }
       }while(c!=5);
   }
}