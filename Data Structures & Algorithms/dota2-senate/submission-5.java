class Solution {
    public String predictPartyVictory(String senate) {
        StringBuilder sb = new StringBuilder(senate);
        int count = 0, i = 0;

        while(i < sb.length()){
            char c = sb.charAt(i);
            if(c == 'R'){
                if(count<0) sb.append('D');
                count++;
            }
            else{
                if(count>0) sb.append('R');
                count--;
            }
            i++;
        }

        return count > 0 ? "Radiant" : "Dire";
    }
}