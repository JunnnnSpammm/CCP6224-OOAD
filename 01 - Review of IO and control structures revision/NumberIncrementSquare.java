import java.util.*;

public class NumberIncrementSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int x = input.nextInt();

            if (x < 0 || x > 21) {
                System.out.println("Wrong number range");
                break;
            }

            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                    int val = j * x + i + 1;
                    System.out.printf("%3d", val);
                }
                System.out.println();
            }
        }

        input.close();
    }
}

/**
 * Sample Output:
 * Enter a number: 6
 *   1  7 13 19 25 31
 *   2  8 14 20 26 32
 *   3  9 15 21 27 33
 *   4 10 16 22 28 34
 *   5 11 17 23 29 35
 *   6 12 18 24 30 36
 * Enter a number: 9
 *   1 10 19 28 37 46 55 64 73
 *   2 11 20 29 38 47 56 65 74
 *   3 12 21 30 39 48 57 66 75
 *   4 13 22 31 40 49 58 67 76
 *   5 14 23 32 41 50 59 68 77
 *   6 15 24 33 42 51 60 69 78
 *   7 16 25 34 43 52 61 70 79
 *   8 17 26 35 44 53 62 71 80
 *   9 18 27 36 45 54 63 72 81
 * Enter a number: 200
 * Wrong number range
 */
