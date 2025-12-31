import java.util.*;
class Tanuj
{
    static int consecutive(int ary[]) 
    {
       int n=ary.length;
       if(n==0)
       {
          return 0;
       } 
       int maxcount=0,count=1;
       for(int i=1;i<n;i++)
       {
          if(ary[i]==ary[i-1])
          {
              count++;
          }
          else
          {
              maxcount=Math.max(maxcount,count);
              count=1;
          }
       }
       return Math.max(maxcount,count);
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
        System.out.println("The maximum number of consecutive:-");
        System.out.println(consecutive(ary));
    }
}

/*
| i | arr[i-1] | arr[i] | Condition | count | maxCount   |
| - | -------- | ------ | --------- | ----- | ---------- |
| 1 | 0        | 1      | different | 1     | max(0,1)=1 |
| 2 | 1        | 0      | different | 1     | max(1,1)=1 |
| 3 | 0        | 1      | different | 1     | max(1,1)=1 |
| 4 | 1        | 1      | same      | 2     | 1          |
| 5 | 1        | 1      | same      | 3     | 1          |
| 6 | 1        | 1      | same      | 4     | 1          |


Time Complexity=O(n)
*/