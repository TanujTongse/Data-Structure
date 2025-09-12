//Indexes of Subarray Sum

import java.util.*;
class Demo
{ 
    static ArrayList<Integer> max(int ary[],int target)
    {
        ArrayList<Integer> res=new ArrayList<>();
        int n=ary.length;
        int start=0,c=0;
        for(int i=0;i<n;i++)
        {
            c+=ary[i];
            while(c>target && start<=i)
            {
               c-=ary[start];
               start++;
            }
            if(c==target)
            {
               res.add(start+1);
               res.add(i+1);
               return res;
            }
        }
        res.add(-1);
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
        System.out.println("Enter the Target Value:-");
        int t=s.nextInt();
        System.out.println(max(ary,t));
        
    }
}

//Time Complexity O(n)