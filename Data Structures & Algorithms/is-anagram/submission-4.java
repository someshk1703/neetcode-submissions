class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }
        for(char m: t.toCharArray()){
            freq[m-'a']--;
        }
        for(int f:freq){
            if(f!=0){
                return false;
            }
        }
        return true;
    }
}
