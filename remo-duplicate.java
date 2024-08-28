import java.util.Scanner;
import java.util.Arrays;

class Demo
{
    public static void main(String tt[]) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n = s.nextInt();
        int[] ary = new int[n];
        System.out.println("Enter " + n + " Elements:-");
        for (int i = 0; i < n; i++)
        {
            ary[i] = s.nextInt();
        }

        // Sort the array to bring duplicates together
        Arrays.sort(ary);

        // Print the unique elements
        System.out.println("Unique Elements:");
        if (n > 0)
        {
            System.out.print(ary[0]); // Print the first element
        }

        for (int i = 1; i < n; i++)
        {
            if (ary[i] != ary[i - 1]) 
            {
                // Check if current element is different from the previous one
                System.out.print(" " + ary[i]);
            }
        }

        s.close();
    }
}
