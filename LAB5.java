import java.util.Scanner;

public class LAB5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("hi");
        /*A.	Write a Java program to search for a specific character in a given string. If found, print "Character found at index" followed by its index. If not found, print "Character not found”. */

        /*System.out.println("Enter sentences:");
        String sentences = in.nextLine();
        System.out.println("Enter search:");
        char search = in.next().charAt(0);

        if (sentences.indexOf(search) == -1) {
            System.out.println(search + " doesn't exist in the sentences.");
        } else {
            System.out.println(search + " exists at the index " + sentences.indexOf(search));
        }*/
        /*
        C.	Write a Java program to find the first non-repeated character in a given string. If all characters are repeated, print "All characters are repeated".
        */
        /*System.out.println("Enter sentences:");
        String sentences = in.nextLine().toLowerCase();
        int count = 1;
        
        for (int i = 97; i <= 122; i++) {
            char word = (char) i;
            count = 1;
            int index = 0;
            int check = 0;
            int mark;
            index = sentences.indexOf(word);
            mark = index;
            check = index + 1;
            
            while (count != 2) {
                if (index != -1) {
                    index = sentences.indexOf(word, check);
                    check = index + 1;
                    if (index != mark && index != -1) {
                        count++;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
            
            if (count == 1 && mark != -1) {
                System.out.println((char) i + " is unique");
            }
        }
        
        if (sentences.length() > 0) {
            System.out.println("All characters are repeated");
        }*/
    }
}