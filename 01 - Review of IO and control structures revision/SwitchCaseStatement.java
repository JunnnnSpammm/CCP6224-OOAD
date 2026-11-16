public class SwitchCaseStatement {
    public static void main(String args[]) {
        char grade = args[0].charAt(0);

        switch (grade)
        {
            case 'A' :
                System.out.println("Excellent!"); 
                break;
            case 'B' :
            case 'C' :
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("You passed");
            case 'F' :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invalid grade");
        }

        System.out.println("Your grade is " + grade);
    }
}

/**
 * Sample Output:
 * You passed
 * Better try again
 * Your grade is D
 * 
 * Well done
 * Your grade is B
 * 
 * Excellent!
 * Your grade is A
 */
