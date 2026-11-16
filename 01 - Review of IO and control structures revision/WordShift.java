import java.util.*;

public class WordShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = input.next();
        char[] charArray = word.toUpperCase().toCharArray();
        int len = charArray.length;
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int index = (i + j) % len;
                System.out.print(charArray[index]);
            }
            System.out.println();
        }

        input.close();
    }
}

/**
 * Sample Output:
 * Enter a word: object
 * OBJECT
 * BJECTO
 * JECTOB
 * ECTOBJ
 * CTOBJE
 * TOBJEC
 * 
 * Enter a word: hello
 * HELLO
 * ELLOH
 * LLOHE
 * LOHEL
 * OHELL
 */
