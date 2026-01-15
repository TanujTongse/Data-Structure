import java.util.*;
class Tanuj
{
    static boolean ip4(String s)
    {
        String parts[]=s.split("\\.");
        if(parts.length!=4)
        {
           return false;
        }
        for(String part:parts)
        {
            if(part.length()==0)
            {
                return false;
            }
            if(part.length()>1 && part.charAt(0)=='0')
            {
                return false;
            }
            for(int i=0;i<part.length();i++)
            {
                if(!Character.isDigit(part.charAt(i)))
                {
                    return false;
                }
            }
            int n=Integer.parseInt(part);
            if(n<0 && n>255)
            {
                return false;
            }
        }
        return true;
    }
    static boolean ip6(String s)
    {
        String parts[]=s.split(":");
        if(parts.length!=8) 
        {
           return false;
        }
        for(String part:parts)
        {
           if(part.length()<1 && part.length()>4)
           {
              return false;
           }
           for(int i=0;i<part.length();i++)
           {
              char c=part.charAt(i);
              if(!Character.isDigit(c) && !(c>='a' && c<='f') && !(c>='A' && c<='F'))
              {
                  return false;
              }
           }
        }
        return true;
    }
    static String valid(String ip)
    {
       if(ip.contains(".") && ip4(ip))
       {
           return "IP4";
       }
       if(ip.contains(":") && ip6(ip))
       {
           return "IP6";
       }
       return "INVALID";
    }
    public static void main(String tt[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the IP Address:-");
        String ip=s.nextLine();
        System.out.println(valid(ip));
    }
}