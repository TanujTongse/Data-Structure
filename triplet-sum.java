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
        for(int i=0;i<n-2;i++)
        {
           for(int j=i+1;j<n-1;j++)
           {
              for(int k=j+1;j<n;j++)
              {
                  if(ary[i]+ary[j]+ary[k]==0)
                  {
                      System.out.println(ary[i]+" "+ary[j]+" "+ary[k]);
                      f=true;
                      break;
                  }
              }
           }
        }
        if(!f)
        {
             	System.out.println("No Triplet");
        }
    }
}