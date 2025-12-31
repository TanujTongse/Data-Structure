//COMMON ELEMENT

import java.util.*;
class Demo
{
    static List<Integer> common(int ary1[],int ary2[],int ary3[])
    {
        List<Integer> c=new ArrayList<>();
        int i=0,j=0,k=0;
        while(i<ary1.length && j<ary2.length && ary3.length)
        {
           if(ary1[i]==ary2[j] && ary2[j]==ary3[k])
           {
              c.add(ary1[i]);
              i++;
              j++;
              k++;
              while(i<ary1.length && ary1[i]==ary1[i-1])
                   i++;
              while(j<ary2.length && ary2[j]==ary2[j-1])
                   j++;
              while(k<ary3.length && ary3[k]==ary3[k-1])
                   k++;
           }
           else if(ary1[i]<ary2[j])
           {
               i++;
           }
           else if(ary2[j]<ary3[k])
           {
               j++;
           }
           else
           {
               k++;
           }
        }
        return c;
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
       System.out.println("Enter the size of array3:-");
       int n3=s.nextInt();
       int ary3[]=new int[n3];
       System.out.println("Enter "+n3+" Elements:-");
       for(int i=0;i<n3;i++)
       {
          ary3[i]=s.nextInt();
       }
       System.out.println("Common Element is:");
       List<Integer> c=common(ary1,ary2,ary3);
       if(c.size()==0)
         System.out.println(-1);
       for(int i=0;i<c.size();i++)
         System.out.println(c.get(i)+" ");
    }
}