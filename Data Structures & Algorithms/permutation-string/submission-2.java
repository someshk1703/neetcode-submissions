class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] w1 = new int[26];
        int[] w2 = new int[26];
        if(s1.length()>s2.length()) return false;
        for(int i=0; i<s1.length(); i++){
            w1[s1.charAt(i)-'a']++;
            w2[s2.charAt(i)-'a']++;
        }

        if(Arrays.equals(w1,w2)) return true;

        for(int j=s1.length(); j<s2.length(); j++){
            
            w2[s2.charAt(j)-'a']++;
            w2[s2.charAt(j-s1.length())-'a']--;

            if(Arrays.equals(w1,w2)) return true;
        }

        return false;
    }
}
