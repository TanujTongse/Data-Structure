//Longest Palindromic Substring

import java.util.*;
class Demo
{
     static boolean checkpal(String s,int l,int h)
     {
         while(l<h)
         {
             if(s.charAt(l)!=s.charAt(h))
             {
                 return false;
             }
             l++;
             h--;
         }
         return true;
     }
     static String palindrome(String s)
     {
         int n=s.length();
         int maxlen=1,start=0;
         for(int i=0;i<n;i++)
         {
             for(int j=i;j<n;j++)
             {
                 if(checkpal(s,i,j) && (j-i+1) > maxlen)
                 {
                    start=i;
                    maxlen=j-i+1;
                 }
             }
         }
         return s.substring(start,start+maxlen);
     }
     public static void main(String tt[])
     {
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the String:-");
         String str=s.nextLine();
         System.out.println("Longest Palindrome:-"+palindrome(str));
     }
}

/*
checkPal("racecar", 0, 6)

| Iteration | low | high | s\[low] | s\[high] | Match?                           |
| --------- | --- | ---- | ------- | -------- | -------------------------------- |
| 1         | 0   | 6    | 'r'     | 'r'      | ✅                                |
| 2         | 1   | 5    | 'a'     | 'a'      | ✅                                |
| 3         | 2   | 4    | 'c'     | 'c'      | ✅                                |
| 4         | 3   | 3    | 'e'     | 'e'      | ✅ (middle character, loop stops) |


Generating all sub-strings - O(n^3) time and O(1) space
*/