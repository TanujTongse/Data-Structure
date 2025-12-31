//Floor in a Sorted Array

import java.util.*;
class Demo
{
   static int findflore(int ary[],int x)
   {
      int n=ary.length;
      if(x>=ary[n-1])
      {
         return n-1;
      }
      if(x<ary[0])
      {
         return -1;
      }
      int ans=-1;
      for(int i=0;i<n;i++)
      {
         if(ary[i]>x)
         {
            return i-1;
         }
      }
      return ans;
   }
   public static void main(String tt[])
   {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the size of array:-");
      int n=s.nextInt();
      int ary[]=new int[n];
      System.out.println("Enter "+n+" Elements:");
      for(int i=0;i<n;i++)
      {
         ary[i]=s.nextInt();
      }
      System.out.println("Enter the value:-");
      int x=s.nextInt();
      System.out.println(findflore(ary,x));
   }
}

//[Naive Method] – Using Linear Search – O(n) Time and O(1) Space