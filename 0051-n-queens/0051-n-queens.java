class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ls=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        finding(n,0,ls,board);
        return ls;
    }
    public static void finding(int n,int idx, List<List<String>> ls,char[][] board){
        if(idx==n){
            ls.add(set(board));
            return;
        }
        for(int i=0;i<n;i++){
            if(isSafe(n,idx,i,board)){
                    board[idx][i]='Q';
                    finding(n,idx+1,ls,board);
                    board[idx][i]='.';
                }
        }
    }
    
    static List<String> set(char[][] board){
        List<String> ans=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String row = new String(board[i]);
            ans.add(row);
        }
        return ans;
    }
    static boolean isSafe(int n,int row,int col,char[][] board){
        for (int i = 0; i < row; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        //for checking left diagonal

        int maxLeft = Math.min(row, col);

        for (int i = 1; i <= maxLeft; i++) {
            if(board[row - i][col - i] == 'Q') {
                return false;
            }
        }

        //for checking right diagonal

        int maxRight = Math.min(row, board.length - 1 - col);

        for (int i = 1; i <= maxRight; i++) {
            if(board[row - i][col + i] == 'Q') {
                return false;
            }
        }

        return true;
    }
}