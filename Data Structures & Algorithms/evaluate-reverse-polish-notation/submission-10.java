class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> op = new ArrayDeque<>();

        for(String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                
                int a = op.pop();
                int b = op.pop();
                switch(token){
                    case "+":
                        op.push(a+b);
                        break;
                    case "-":
                        op.push(b-a);
                        break;
                    case "*":
                        op.push(a*b);
                        break;
                    case "/":
                        op.push(b/a);
                        break;
                }
            }
            else{
                op.push(Integer.parseInt(token));
            }
        }

        return op.pop();
    }
}
