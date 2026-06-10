class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> astr = new Stack<>();

        for(int ast: asteroids){
            boolean alive = true;

            while(!astr.isEmpty() && ast<0 && astr.peek()>0){

                int topast = astr.peek();
                int absast = Math.abs(ast);

                if(absast<topast){
                    alive = false;
                    break;
                }
                else if(absast==topast){
                    astr.pop();
                    alive = false;
                    break;
                }
                else{
                    astr.pop();
                }
            }
            if(alive){
                astr.push(ast);
            }
        }

        int[] size = new int[astr.size()];
        for(int i=size.length-1; i>=0; i--){
            size[i]=astr.pop();
        }

        return size;
    }
}