//Merge two sorted arrays

import java.util.*;
class Demo
{
    static void merge(int ary1[],int ary2[],int ary3[])
    {
        int n1=ary1.length;
        int n2=ary2.length;
        int i=0,j=0,k=0;
        while(i<n1)
        {
            ary3[k++]=ary1[i++];
        } 
        while(j<n2)
        {
            ary3[k++]=ary2[j++];
        }
        Arrays.sort(ary3);
    }
    public static void main(String tt[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array1:-");
        int n1=s.nextInt();
        int ary1[]=new int[n1];
        System.out.println("Enter "+n1+" Elements:-");
        for(int i=0;i<n1;i++)
        {
            ary1[i]=s.nextInt();
        }
        System.out.println("Enter the size of array2:-");
        int n2=s.nextInt();
        int ary2[]=new int[n2];
        System.out.println("Enter "+n2+" Elements:-");
        for(int i=0;i<n2;i++)
        {
            ary2[i]=s.nextInt();
        }
        int ary3[]=new int[ary1.length+ary2.length];
        merge(ary1,ary2,ary3);
        System.out.println("Merged Array is:-");
        for(int value:ary3)
        {
           System.out.println(value);
        }
    }
}

//Merge of Merge Sort O(n1 + n2) time and O(n1 + n2) space