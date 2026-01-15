//Check if given String is Pangram or not

import java.util.*;
class Tanuj
{
   static int MAX_CHAR=26;
   static boolean panagram(String s)
   {
       boolean v[]=new boolean[MAX_CHAR];
       for(int i=0;i<s.length();i++)
       {
          char c=s.charAt(i);
          if(c>='A' && c<='Z')
          {
             v[c-'A']=true;
          }
          else if(c>='a' && c<='z')
          {
             v[c-'a']=true;
          }
       }
       for(int i=0;i<MAX_CHAR;i++)
       {
          if(!v[i])
          {
             return false;
          }
       }
       return true;
   }
   public static void main(String tt[])
   {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the String:-");
      String in=s.nextLine();
      System.out.println("Sentence is Panagram:-");
      if(panagram(in)==true)
      {
          System.out.println("True");
      }
      else
      {
          System.out.println("False");
      }
   }
}

//Using Visited Array - O(n) Time and O(MAX_CHAR) Space