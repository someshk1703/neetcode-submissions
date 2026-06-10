class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> asteroid = new ArrayDeque<>();

        for(int n : asteroids){

            boolean val = true;
            while(!asteroid.isEmpty() && n<0 && asteroid.peek()>0){  

                int topast = asteroid.peek();
                int absast = Math.abs(n);

                if(topast<absast){
                    asteroid.pop();
                }
                else if(topast==absast){
                    val=false;
                    asteroid.pop();
                    break;
                }
                else{
                    val=false;
                    break;
                }
            }

            if(val) asteroid.push(n);
        }

        int[] res = new int[asteroid.size()];
        for(int n = res.length-1; n>=0; n--){
            res[n] = asteroid.pop();
        }

        return res;
    }
}