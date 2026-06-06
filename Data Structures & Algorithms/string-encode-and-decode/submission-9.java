class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            int n = str.length();
            sb.append(n);
            sb.append('#');
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int delimiterIndex = str.indexOf('#', i);
            String lengthStr = str.substring(i, delimiterIndex);
            int length = Integer.parseInt(lengthStr);
            int start = delimiterIndex + 1;
            String word = str.substring(start, start + length);
            result.add(word);
            i = start + length;
        }
        return result;
    }
}