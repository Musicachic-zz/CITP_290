import java.util.Scanner;


public class HelloWorld
{
    public static void main (String[] args)
    {

        int selection = 0;

        System.out.println("Menu options \n" +
                "Press 1 to get a personalized greeting.\n" +
                "Press 2 to get the sum of two numbers. \n" +
                "Press 3 to exit the program");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your selection: ");
        int choice = sc.nextInt();

        //System.out.println("Hello World");
        while (choice <= 3)

        {
            if (choice == 1)
            {
                System.out.print("Enter your name: ");
                String name = sc.next();

                System.out.println("Hello " + name);
            }


        if (choice == 2)
        {
            System.out.print("Enter your first number: ");
            int x = sc.nextInt();
            System.out.print("Enter your second number: ");
            int y = sc.nextInt();
            int z;
            z = x + y;

            System.out.println("The sum of your two numbers equals: " + z);


        }


        if (choice == 3)
        {
            System.out.println("You have exited the program.");
            break;
        }

        else
        {
            System.out.println("Please enter a number: 1, 2, or 3.");
        }
        }
    }
}
