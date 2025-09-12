import java.util.Scanner;
class Demo
{
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
        boolean f=false;
        int c=0;
        for(int i=0;i<n-2;i++)
        {
           for(int j=i+1;j<n-1;j++)
           {
              for(int k=j+1;k<n;k++)
              {
                  if(ary[i]+ary[j]+ary[k]==0)
                  {
                      System.out.println(ary[i]+" "+ary[j]+" "+ary[k]);
                      f=true;
                      c++;
                  }
              }
           }
        }
        if(!f)
        {
             	System.out.println("No Triplet");
        }
        else
        {
                System.out.println("There are "+c+" Triplet");
        }
    }
}