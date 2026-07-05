class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];

        for(int t : tasks) count[t-'A']++;

        Arrays.sort(count);
        int maxf = count[25];
        int idle = (maxf - 1)*n;

        for(int i=24; i>=0; i--) idle -= Math.min(maxf - 1, count[i]);

        return Math.max(0,idle) + tasks.length;
    }
}
