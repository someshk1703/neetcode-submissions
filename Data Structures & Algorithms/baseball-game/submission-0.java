class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(String s : operations){
            if(s.equals("+")){

                int top = stack.pop();
                int beforetop = stack.peek();
                int newscore = top + beforetop;
                
                stack.push(top);
                stack.push(newscore);
            }
            else if(s.equals("D")){
                stack.push(stack.peek()*2);
            }
            else if(s.equals("C")){
                stack.pop();
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }
        int total = 0;
        for(int n: stack){
            total += n;
        }
        return total;
    }
}