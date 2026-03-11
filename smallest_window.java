//Smallest window containing 0, 1 and 2

import java.util.*;
class Tanuj
{ 
   static int smallstring(String s)
   {
      int res=Integer.MAX_VALUE;
      boolean zero=false,one=false,two=false;
      int zeroindex=0,oneindex=1,twoindex=2;
      for(int i=0;i<s.length();i++)
      {
         if(s.charAt(i)=='0')
         {
             zero=true;
             zeroindex=i;
         }
         else if(s.charAt(i)=='1')
         {
             one=true;
             oneindex=i;
         }
         else if(s.charAt(i)=='2')
         {
             two=true;
             twoindex=i;
         }
         if(zero && one && two)
         {
             int max=Math.max(zeroindex,Math.max(oneindex,twoindex));
             int min=Math.min(zeroindex,Math.min(oneindex,twoindex));
             res=Math.min(res,max-min+1);
         }
      }
      if(res==Integer.MAX_VALUE)
      {
         return -1;
      }
      return res;
   }
   public static void main(String tt[])
   {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the String:-");
      String s1=s.nextLine();
      System.out.println("Smallest Sub String "+smallstring(s1));
   }
}

//Index Tracking - O(n) Time and O(1) Space