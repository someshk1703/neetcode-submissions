class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;

        Map<Integer, Integer> mp = new HashMap<>();
        for(int h : hand) mp.put(h , mp.getOrDefault(h,0)+1);

        for(int h : hand){
            int start = h;
            while(mp.getOrDefault(start - 1, 0) > 0) start--;
            while(start<=h){
                while(mp.getOrDefault(start, 0) > 0){
                    for(int i = start; i < start + groupSize; i++){
                        if(mp.getOrDefault(i , 0) == 0) return false;
                        mp.put(i, mp.get(i)-1);
                    }
                }
                start++;
            }
        }
        return true;
    }
}
