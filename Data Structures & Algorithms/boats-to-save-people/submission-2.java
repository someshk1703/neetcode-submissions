class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int light = 0;
        int weight = people.length-1;
        int boats = 0;
        while(light<=weight){
            if(people[light]+people[weight]<=limit){
                light++;
            }
            weight--;
            boats++;
        }
        return boats;
    }
}