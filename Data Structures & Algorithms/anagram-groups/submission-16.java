class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String g: strs){
            char[] cs = g.toCharArray();
            Arrays.sort(cs);
            String s = new String(cs);
            if(!map.containsKey(s)){
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(g);
        }
        return new ArrayList<>(map.values());
    }
}
