//Recursively remove all adjacent duplicates

import java.util.*;
class Demo
{
    static String remove(String s)
    {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
             boolean repeate=false;
             while(i+1<n && s.charAt(i)==s.charAt(i+1))
             {
                 repeate=true;
                 i++;
             }
             if(!repeate)
             {
                 sb.append(s.charAt(i));
             }
        }
        if(n==sb.length())
        {
           return sb.toString();
        }
        return remove(sb.toString());
    }
    public static void main(String tt[])
    {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter The String:-");  
       String str=s.nextLine();
       System.out.println("Removing "+remove(str));
    }
}

/*
Time Complexity: O(n2)
Auxiliary Space: O(n2)
*/