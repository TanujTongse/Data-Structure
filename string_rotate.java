//Check if Strings Are Rotations of Each Other

import java.util.*;
class Tanuj
{
   static boolean rotate(String s1,String s2)
   {
      int n=s1.length();
      for(int i=0;i<n;i++)
      {
          if(s1.equals(s2))
          {
             return true;
          }
          char last=s1.charAt(s1.length()-1);
          s1=last+s1.substring(0,s1.length()-1);
      }
      return false;
   }
   public static void main(String tt[])
   {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the First String:-");
       String s1=s.nextLine();
       System.out.println("Enter the Second String:-");
       String s2=s.nextLine();
       System.out.println(rotate(s1,s2));
   } 
}

/*
   Generating all rotations - O(n^2) Time and O(1) Space
*/