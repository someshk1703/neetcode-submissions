class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                // We found a mismatch. We must try both options:
                // Option 1: Skip the left character -> check substring (left + 1, right)
                // Option 2: Skip the right character -> check substring (left, right - 1)
                return isPurePalindrome(s, left + 1, right) || isPurePalindrome(s, left, right - 1);
            }
        }
        
        return true;
    }
    
    // Helper method to check if a specific range is a perfect palindrome
    private boolean isPurePalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}