class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> temp = new Stack<>();
        int[] day = new int[temperatures.length];
        for(int i=0; i<temperatures.length; i++){
            
            while(!temp.isEmpty() && temperatures[i]>temperatures[temp.peek()]){
                int d = temp.pop();
                day[d] = i - d;
            }
            temp.push(i);
        }
        return day;
    }
}
