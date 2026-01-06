//Adding one to number represented as array of digits

import java.util.*;
class Tanuj
{
   static int[] oneplus(int ary[])
   {
      int n=ary.length;
      int carry=1;
      for(int i=n-1;i>=0;i--)
      {
         int sum=ary[i]+carry;
         ary[i]=sum%10;
         carry=sum/10;
      }
      if(carry>0)
      {
          int newary[]=new int[n+1];
          newary[0]=carry;
          System.arraycopy(ary,0,newary,1,n);
          return newary;
      }
          return ary;
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
      System.out.println("Add 1 Number in Array Element:-");
      int r[]=oneplus(ary);
      for(int i:r)
      {
         System.out.print(i);
      }
   }
}

/*
n = 3
ary = [1, 2, 9]

| i | ary[i] | sum = ary[i]+carry | ary[i]=sum%10 | carry=sum/10 |
| - | ------ | ------------------ | ------------- | ------------ |
| 2 | 9      | 10                 | 0             | 1            |
| 1 | 2      | 3                  | 3             | 0            |
| 0 | 1      | 1                  | 1             | 0            |

[1, 3, 0]


Using Carry - O(n) Time and O(1) Space
*/