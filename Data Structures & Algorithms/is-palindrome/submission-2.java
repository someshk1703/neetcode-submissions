class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        s = s.toLowerCase();
        char[] c = s.toCharArray();

        while(left<right){
            while(left<right && !Character.isLetterOrDigit(c[left])){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(c[right])){
                right--;
            }
            if(c[left] != c[right])
                return false;
            left++;
            right--;
        }
        return true; 
    }
}
