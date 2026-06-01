class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> grp = new HashMap<>();
        for(String s: strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            if(!grp.containsKey(sorted)){
                grp.put(sorted,new ArrayList<>());
            }
            grp.get(sorted).add(s);
        }
        return new ArrayList<>(grp.values());
    }
}
