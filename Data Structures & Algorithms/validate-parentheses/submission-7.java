class Solution {
    public boolean isValid(String s) {
        Stack<Character> o = new Stack<>();
        for(char t: s.toCharArray()){
            if(t=='[' || t=='(' || t=='{'){
                o.push(t);
            }
            else{
                if(o.isEmpty()) return false;
                char c = o.pop();
                if(t==']' && c!='[') return false;
                if(t==')' && c!='(') return false;
                if(t=='}' && c!='{') return false;
            }
        }
        return o.isEmpty();
    }
}
