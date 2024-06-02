import java.util.Scanner;

public class GitCommit {
    public static void main(String[] args) {
        //Take a String from User and reverse it

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any word");

        String word = scanner.nextLine();
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        System.out.println(reversedWord);
    }
}
