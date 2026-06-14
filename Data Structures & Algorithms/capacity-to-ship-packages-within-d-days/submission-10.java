class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0,right = 0;
        for(int w : weights){
            left = Math.max(left,w);
            right += w;
        }
        int res = right;

        while(left<=right){
            int mid = left + (right-left)/2;
            if(canShip(weights,days,mid)){
                res = Math.min(res,mid);
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return res;
    }
    
    public boolean canShip(int[] weights,int days,int mid){
        int ship = 1, curmid = mid;
        for(int w : weights){
            if(curmid - w<0){
                ship += 1;
                curmid = mid;
            }
            curmid -= w;
        }
        return ship <= days;
    }
}