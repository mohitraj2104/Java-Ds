import java.util.HashSet;

public class Recursion12 {

    // Recursive method to generate subsequences
    public static void subsequences(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            set.add(newString);  // Add to set for uniqueness
            return;
        }

        char currChar = str.charAt(idx);

        // Include current character
        subsequences(str, idx + 1, newString + currChar, set);

        // Exclude current character
        subsequences(str, idx + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> uniqueSubsequences = new HashSet<>();

        subsequences(str, 0, "", uniqueSubsequences);

        // Print all unique subsequences
        for (String s : uniqueSubsequences) {
            System.out.println(s);
        }
    }
}
