package palindrometask1;

public class Palindrome {

    public static void main(String[] args) {
        String[] words = {"abc", "bcd", "aba", "cfg", "madam"};
        boolean foundPalindrome = false;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean isPalindrome = true;

            for (int j = 0; j < word.length() / 2; j++) {
                if (word.charAt(j) != word.charAt(word.length() - 1 - j)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println(word);
                foundPalindrome = true;
                break; // Stop searching after finding the first palindrome
            }
        }

        if (!foundPalindrome) {
            System.out.println("No palindrome found");
        }
    }
}
