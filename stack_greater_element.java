//Next Greater Element in Array

import java.util.*;
class Tanuj
{
    static ArrayList<Integer> greater(int ary[])
    {
        int n=ary.length;
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            res.add(-1);
        } 
        for(int i=0;i<n;i++)
        {
           for(int j=i+1;j<n;j++)
           {
              if(ary[j]>ary[i])
              {
                  res.set(i,ary[j]);
                  break;
              }
           }
        }
        return res;
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
        System.out.println("Greater Element is:-");
        ArrayList<Integer> res=greater(ary);
        for(int v:res)
        {
           System.out.print(v+" ");
        }
    }
}

//Using Nested Loops - O(n2) Time and O(1) Space