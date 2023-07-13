import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = s1.toLowerCase();
        String s4 = s2.toLowerCase();
        char[] arr1 = new char[s3.length()];
        char[] arr2 = new char[s4.length()];

        for (int i = 0; i < s3.length(); i++) {
            arr1[i] = s3.charAt(i);

        }
        for (int i = 0; i < s4.length(); i++) {
            arr2[i] = s4.charAt(i);

        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // System.out.println(arr1.toString());
        // System.out.println(arr2.toString());

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

    }

}
