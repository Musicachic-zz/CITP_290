import java.util.Scanner;

public class GreatestCommonDivisor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter another number: ");
        int b = sc.nextInt();
        System.out.println("GDC is: " + gdc(a, b));
    }

    private static int gdc(int x, int y)
    {
        while (y != 0)
        {
            int z = x % y;
            x = y;
            y = z;

        }
        return x;
    }
}
