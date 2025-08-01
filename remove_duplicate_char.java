//Remove Duplicate Word in a String

import java.util.*;
class Demo
{
    static String removedupli(String s)
    {
        StringBuilder sb=new StringBuilder(s.length());
        boolean seen[]=new boolean[256];
        for(int i=0;i<s.length();i++)
        {
           char c=s.charAt(i);
           if(!seen[c])
           {
               sb.append(c);
               seen[c]=true;
           }
        }
        return sb.toString();
    }
    public static void main(String tt[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String:-");
        String s1=s.nextLine();
        System.out.println(removedupli(s1));
    }
}

//Time Complexity  O(n*n)

/*
Time Complexity  O(n)

import java.util.*;
class Demo
{ 
    static String removeduplicate(String s)
    {
         StringBuilder sb=new StringBuilder();
         int ch[]=new int[256];
         for(char c:s.toCharArray())
         {
             if(ch[c]==0)
             {
                 sb.append(c);
                 ch[c]++;
             }
         }
         return sb.toString();
    }
    public static void main(String tt[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String:-");
         String str=s.nextLine();
       System.out.println("Removing "+removeduplicate(str));
    }
}
*/