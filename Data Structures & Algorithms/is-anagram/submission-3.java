class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] n = new int[26];
        for(char c : s.toCharArray()){
            n[c-'a']++;
        }
        for(char c : t.toCharArray()){
            n[c-'a']--;
        }
        for(int m : n){
            if(m!=0){
                return false;
            }
        }
        return true;
    }
}
