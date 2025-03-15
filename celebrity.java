import java.util.Scanner;
class Demo
{
    static boolean knows(int[][] ary, int a, int b)
    {
        return ary[a][b] == 1;
    }
    static int findcele(int[][] ary, int n)
    {
        int celeb = 0;
        for (int i = 1; i < n; i++)
        {
            if (knows(ary, celeb, i))
            {
                celeb = i;
            }
        }
        for (int i = 0; i < n; i++)
        {
            if (i != celeb && (knows(ary, celeb, i) || !knows(ary, i, celeb))) 
            {
                return -1; 
            }
        }
        return celeb; 
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number of Rows (People):");
        int r = s.nextInt(); // number of people
        System.out.println("Enter the Number of Columns (People):");
        int c = s.nextInt(); // number of people
        System.out.println("Enter the matrix elements (relationship matrix):");
        int[][] ary = new int[r][c];
        
        // Fill the matrix with input values (0 or 1)
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                ary[i][j] = s.nextInt();
            }
        }
        
        // Print the matrix to verify the input
        System.out.println("Matrix Elements:");
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++) 
            {
                System.out.print(ary[i][j] + " ");
            }
            System.out.println();
        }
        int celeb = findcele(ary, r);
        if (celeb == -1)
        {
            System.out.println("There is no celebrity.");
        } 
        else
        {
            System.out.println("The Celebrity Person is: " + celeb);
        }
    }
}
