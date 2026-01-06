//Stock Buy and Sell - Multiple Transaction Allowed

import java.util.*;
class Tanuj
{
   static int maxi(int price[],int s,int e)
   {
      int n=price.length;
      int r=0;
      for(int i=s;i<e;i++) 
      {
         for(int j=i+1;j<=e;j++)
         {
            if(price[j]>price[i])
            {
               int cur=(price[j]-price[i])+maxi(price,s,i-1)+maxi(price,j+1,e);
               r=Math.max(r,cur);
            }
         }
      }
      return r;
   }
   static int maxprofit(int price[])
   {
       int n=price.length;
       return maxi(price,0,n-1);
   }
   public static void main(String tt[])
   {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the size of array:-");
      int n=s.nextInt();
      int ary[]=new int[n];
      System.out.println("Enter "+n+" Elements:-");
      for(int i=0;i<n;i++)
      {
         ary[i]=s.nextInt();
      }
      System.out.println("Maximum Profit is "+maxprofit(ary));
   }
}

//By Trying All Possibility - O(2n) Time and O(n) Space