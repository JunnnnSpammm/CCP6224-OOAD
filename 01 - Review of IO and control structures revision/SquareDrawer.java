import java.util.*;

public class SquareDrawer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter an integer >0 and <21: ");
            int x = input.nextInt();

            if (x < 0 || x > 21) {
                System.out.println("Wrong number range");
                break;
            }

            for (int n = 0; n < x; n = n+1) {
                System.out.print("* ");
            }
            System.out.print("\n");
            for (int n = 0; n < x-2; n = n+1) {
                System.out.print("* ");
                for (int j = 0; j < x-2; j = j+1) {
                    System.out.print("  ");
                }
                System.out.print("*\n");
            }
            for (int n = 0; n < x; n = n+1) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        input.close();
    }
}

/**
 * Sample Output:
 * Enter an integer >0 and <21: 
 * 5
 * * * * * * 
 * *       *
 * *       *
 * *       *
 * * * * * * 
 * Enter an integer >0 and <21: 
 * 9
* * * * * * * * * * 
* *               *
* *               *
* *               *
* *               *
* *               *
* *               *
* *               *
* * * * * * * * * * 
* Enter an integer >0 and <21: 
* 66
* Wrong number range
*/
