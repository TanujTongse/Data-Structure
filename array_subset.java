//Check if an array is subset of another array

import java.util.*;
class Tanuj
{
   static boolean subset(int ary1[],int ary2[])
   {
      int n1=ary1.length;
      int n2=ary2.length;
      for(int i=0;i<n1;i++)
      {
         boolean f=false;
         for(int j=0;j<n2;j++)
         {
            if(ary1[i]==ary2[j])
            {
               ary2[j]=-1; 
            }
         }
         if(!f)
         {
            return false;
         }
      }
      return true;
   }
   public static void main(String tt[])
   {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the size of first array:-");
      int n1=s.nextInt();
      System.out.println("Enter "+n1+" Elements:-");
      int ary1[]=new int[n1];
      for(int i=0;i<n1;i++)
      {
         ary1[i]=s.nextInt();
      }
      System.out.println("Enter the size of second array:-");
      int n2=s.nextInt();
      System.out.println("Enter "+n2+" Elements:-");
      int ary2[]=new int[n2];
      for(int i=0;i<n2;i++)
      {
         ary2[i]=s.nextInt();
      }
      System.out.println("Subset is:-");
      if(subset(ary1,ary2))
      {
          System.out.println("True");
      }
      else
      {
          System.out.println("False");
      }
   }
}

//Using Nested Loops - O(n1*n2) Time and O(1) Space