class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            // Check if the token is an operator
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                // Pop the right operand first
                int b = stack.pop();
                // Pop the left operand second
                int a = stack.pop();
                
                // Evaluate the expression and push the result back
                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        // Integer division in Java naturally truncates toward zero
                        stack.push(a / b);
                        break;
                }
            } else {
                // Token is a string integer, parse and push it
                stack.push(Integer.parseInt(token));
            }
        }
        
        // The last remaining element is the total evaluation
        return stack.pop();
    }
}