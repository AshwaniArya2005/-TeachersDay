public class Problem {

    // Q)Valid Palindrome
    // Given a string s, return true if it is a palindrome, or false otherwise.

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i)))
                i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j)))
                j--;

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;

            }
            i++;
            j--;
        }
        return true;

    }
}
