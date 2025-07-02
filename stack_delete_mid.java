import java.util.*;
class Demo
{
     static void deletemid(Stack<Integer> st)
     {
          int n=st.size();
          Stack<Integer> tempst=new Stack<>();
          int count=0;

          while(count<n/2)
          {
              int c=st.pop();
              tempst.push(c);
              count++;
          }
          st.pop();
          while(!tempst.isEmpty())
          {
              st.push(tempst.pop());
          }
     } 
     public static void main(String tt[])
     {
          Stack<Integer> st=new Stack<>();
          Scanner s=new Scanner(System.in);
          System.out.println("Enter the size of elements:-");
          int n=s.nextInt();
          for(int i=0;i<n;i++)
          {
              st.push(s.nextInt());
          } 
          System.out.println("Deleted Midile Elements:-");
          deletemid(st);
          while(!st.isEmpty())
          {
              int p=st.pop();
              System.out.println(p);
          }
     }
}