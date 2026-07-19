class Solution {
    public int openLock(String[] deadends, String target) {
        if(target.equals("0000")) return 0;

        Set<String> visit = new HashSet<>(Arrays.asList(deadends));
        if(visit.contains("0000")) return -1;

        Queue<String> q = new LinkedList<>();
        q.add("0000");
        visit.add("0000");
        int steps = 0;

        while(!q.isEmpty()){
            steps++;
            for(int i=q.size(); i>0; i--){
                String lock = q.poll();
                for(int j=0; j<4; j++){
                    for(int move: new int[]{1,-1}){
                        char[] arr = lock.toCharArray();
                        arr[j] = (char)((arr[j]-'0' + move + 10)%10 + '0');

                        String nextlock = new String(arr);
                        if(visit.contains(nextlock)) continue;
                        if(nextlock.equals(target)) return steps;

                        q.add(nextlock);
                        visit.add(nextlock);
                    }
                }
            }
        }
        return -1;
    }
}