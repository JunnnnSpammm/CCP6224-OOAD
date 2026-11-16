import java.util.*;

public class NumberSquareDrawer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter an integer >0 and <21: ");
            int x = input.nextInt();

            if (x < 0 || x > 21) {
                System.out.println("Wrong number range");
                break;
            }

            for (int n = 1; n <= x; n = n+1) {
                System.out.print(n + " ");
            }
            System.out.print("\n");
            for (int n = 0; n < x-2; n = n+1) {
                System.out.print((n+2) + " ");
                for (int j = 0; j < x-2; j = j+1) {
                    System.out.print("  ");
                }
                System.out.print((x-n-1) + "\n");
            }
            for (int n = 0; n < x; n = n+1) {
                System.out.print((x-n) + " ");
            }
            System.out.print("\n");
        }

        input.close();
    }
}

/**
 * Sample Output:
 * Enter an integer >0 and <21: 
 * 3
 * 1 2 3 
 * 2   2
 * 3 2 1 
 * Enter an integer >0 and <21: 
 * 9
 * 1 2 3 4 5 6 7 8 9 
 * 2               8
 * 3               7
 * 4               6
 * 5               5
 * 6               4
 * 7               3
 * 8               2
 * 9 8 7 6 5 4 3 2 1 
 * Enter an integer >0 and <21: 
 * 66
 * Wrong number range
*/
