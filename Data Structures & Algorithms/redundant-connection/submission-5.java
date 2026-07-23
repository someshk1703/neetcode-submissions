class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] parent = new int[edges.length+1];
        int[] rank = new int[edges.length+1];

        for(int i=0; i<parent.length; i++){
            parent[i]=i;
            rank[i]=1;
        }

        for(int[]edge: edges){
            if(!union(parent, rank, edge[0], edge[1])) return new int[]{edge[0], edge[1]};
            
        }
        return new int[0];
    }
    public int find(int n, int[] parent){
        int p = parent[n];
        while(p != parent[p]){
            parent[p] = parent[parent[p]];
            p = parent[p];
        }
        return p;
    }
    public boolean union(int[] parent, int[] rank, int u, int v){
        int p1 = find(u, parent);
        int p2 = find(v, parent);

        if(p1==p2) return false;
        if(rank[p1]>rank[p2]){
            parent[p2] = p1;
            rank[p1] += rank[p2];
        } else{ 
            parent[p1] = p2;
            rank[p2] += rank[p1];
        }
        return true;
    }
}
