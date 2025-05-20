package Bhushan;
import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctUsername = "bhushan";
        String correctPassword = "pass152";
        System.out.println("----User Authentication----");
        System.out.println("Enter username:");
        String username = sc.nextLine();
        System.out.println("Enter password:");
        String password = sc.nextLine();
        if (!username.equals(correctUsername) || !password.equals(correctPassword)) {
            System.out.println("Authentication failed! Exiting program.");
            sc.close();
            return;
        }
        System.out.println("Authentication successful!\n");
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine().toLowerCase();
        System.out.println("Enter the word you want to count:");
        String word = sc.nextLine().toLowerCase();
        String[] words = sentence.split(" ");
        int count = 0;
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        System.out.println("The word'"+word+"'appears"+count +" time(s).");

        sc.close();
    }
}

