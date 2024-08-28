import java.util.Scanner;
class Demo
{
    int partition(int ary[],int s,int e)
    {
        int pivot=ary[s];
        int i=s;
        for(int j=s+1;j<=e;j++)
        {
            if(ary[j]<pivot)
            {
               i++;
               int t=ary[i]; 
               ary[i]=ary[j];
               ary[j]=t;
            }
        }
        int sw=ary[i];
        ary[i]=ary[s];
        ary[s]=sw;
        return i;
    }
    void quick(int ary[],int s,int e)
    {
        if(s<e)
        {
           int pi=partition(ary,s,e);
           quick(ary,s,pi-1);
           quick(ary,pi+1,e);
        }
    }
    public static void main(String tt[])
    {
        Scanner s=new Scanner(System.in);
        Demo d=new Demo();
        System.out.println("Enter the size of array:-");
        int n=s.nextInt();
        int ary[]=new int[n];
        System.out.println("Enter "+n+" Elements:-");
        for(int i=0;i<n;i++) 
        {
             ary[i]=s.nextInt();
        }
        System.out.println("Sorted Element:-");
        d.quick(ary,0,ary.length-1);
        for(int i=0;i<ary.length;i++)
        {
           System.out.println(ary[i]);
        }
    }
}

/*
    Time Complexity   
    O(n*log(n)) on average and in the best case,
    but O(n^2) in the worst case
*/