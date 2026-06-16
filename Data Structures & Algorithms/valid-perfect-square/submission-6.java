class Solution {
    public boolean isPerfectSquare(int num) {
        for(int i = 1; i<=num; i++) {
            if(i*i==num) return true;
            else continue;
        }
        return false;
    }
}