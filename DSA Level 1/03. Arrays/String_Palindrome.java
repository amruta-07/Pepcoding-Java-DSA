
// Given a string of S as input. Your task is to write a program to remove or delete the minimum number of characters from the string so that the resultant string is a palindrome.
import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // abdbac
        // String s = "abcde";
        String org_string = s;
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);

        }
        // System.out.println(rev);
        if (org_string.equals(rev)) {
            System.out.println("True ");
        } else {
            System.out.println("False");
        }

    }

}
