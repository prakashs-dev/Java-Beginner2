import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void findSubsequences(String s) {
        List<String> subsequences = new ArrayList<>();
        generateSubsequences(s, 0, "", subsequences);
        
        for (String subsequence : subsequences) {
            System.out.print(subsequence+" ");
        }
    }

    private static void generateSubsequences(String input, int currentIndex, String currentSubsequence, List<String> subsequences) {
        if (currentIndex == input.length()) {
            subsequences.add(currentSubsequence);
            return;
        }

        generateSubsequences(input, currentIndex + 1, currentSubsequence + input.charAt(currentIndex), subsequences);

        generateSubsequences(input, currentIndex + 1, currentSubsequence, subsequences);
    }

    public static void main(String[] args) {
        String input = "abc";
        findSubsequences(input);
        
    }
}
