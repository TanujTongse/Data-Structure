//Check String Palindrome

import java.util.*;
class Demo
{
    static boolean palindrome(String s)
    {
       s=s.toLowerCase();
       String res="";
       for(int i=s.length()-1;i>=0;i--)
       {
           res=res+s.charAt(i);
       }
       return s.equals(res);
    }
    public static void main(String tt[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String:-");
        String st=s.nextLine();
        boolean res=palindrome(st);
        if(res)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}

// Time Comeplexity O(n);