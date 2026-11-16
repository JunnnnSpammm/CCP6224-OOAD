import java.util.*;
import java.io.*;

class TestLoop {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        Boolean quit = Boolean.valueOf(false);

        while (!quit){ // can be replaced with "true"
            System.out.println("Enter y to quit any other key to continue: ");
            char in = input.next().charAt(0);
        
            if (in=='y')
                quit = true; // or use "break"
        }

        input.close();
    }
}

/**
 * Sample Output:
 * Enter y to quit any other key to continue: 
 * x
 * Enter y to quit any other key to continue: 
 * c
 * Enter y to quit any other key to continue: 
 * y
 */