//Anagram


import java.util.*;
class Demo
{
   static boolean anagram(String s1,String s2)
   {
       if(s1.length()!=s2.length())
       {
           return false;
       }
       char str1[]=s1.toCharArray();
       char str2[]=s2.toCharArray();
       Arrays.sort(str1);
       Arrays.sort(str2);
       return Arrays.equals(str1,str2);
   }
   public static void main(String tt[])
   {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the First String:-");
       String s1=s.nextLine();
       System.out.println("Enter the Second String:-");
       String s2=s.nextLine();
       if(anagram(s1,s2)==true)
       {
          System.out.println("True");
       }
       else
       {
          System.out.println("False");
       }
   }
}

/*
Time Complexity: O(m × log(m) + n × log(n))
*/