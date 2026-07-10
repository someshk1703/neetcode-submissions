class Solution {
    List<String> res = new ArrayList<>();
    String[] digitChar = {"","","abc","def","ghi","jkl","mno","qprs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return res;
        dfs(0,"",digits);
        return res;
    }

    public void dfs(int i, String curstr, String digits){
        if(curstr.length() == digits.length()){
            res.add(curstr);
            return;
        }
        String chars = digitChar[digits.charAt(i) - '0'];
        for(char c: chars.toCharArray()) dfs(i+1, curstr+c, digits);
    }
}
