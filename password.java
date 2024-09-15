import java.security.SecureRandom;
import java.util.Scanner;
class Password
{
    String U = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String L = "abcdefghijklmnopqrstuvwxyz";
    String D = "0123456789";
    String S = "!@#$%^&*()_+-=[]{}|;:,.<>?";

    String gpass(int length)
    {
        StringBuilder password = new StringBuilder();
        String ac = U+L+D+S;
        SecureRandom r=new SecureRandom();
        for (int i = 0; i < length; i++)
        {
            int ri = r.nextInt(ac.length());
            password.append(ac.charAt(ri));
        }
        return password.toString();
    }

    public static void main(String tt[])
    {
        Scanner s=new Scanner(System.in);
        Password p=new Password();
        System.out.println("Enter the length of the Password");
        int pl=s.nextInt();
        System.out.println("Generated Password: " +p.gpass(pl));
    }
}
