class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] coloumn = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];
        for(int i=0 ; i<9; i++){
            rows[i] = new HashSet<>();
            coloumn[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        for(int r=0; r<9; r++){
            for(int c=0; c<9; c++){
                char val = board[r][c];
                if(val=='.'){
                    continue;
                }
                int box = (r/3)*3+(c/3);
                if(rows[r].contains(val)||coloumn[c].contains(val)||boxes[box].contains(val)){
                    return false;
                }
                rows[r].add(val);
                coloumn[c].add(val);
                boxes[box].add(val);
            }
        }
        return true;
    }
}
