class Solution {
    public boolean isValidSudoku(char[][] board) {
        int r=board.length;
        int c=board[0].length;
        for(int i=0;i<r;i++)
        {
            HashSet<Character> row=new HashSet<>();
            HashSet<Character> col=new HashSet<>();
            HashSet<Character> box=new HashSet<>();
            for(int j=0;j<c;j++)
            {
                if(board[i][j]!='.')
                {
                    if(row.contains(board[i][j]))
                    {
                        return false;
                    }
                    row.add(board[i][j]);
                }
                if(board[j][i]!='.')
                {
                    if(col.contains(board[j][i]))
                    {
                        return false;
                    }
                    col.add(board[j][i]);
                }
                int r1=3*(i/3)+j/3;
                int c1=3*(i%3)+j%3;
                if(board[r1][c1]!='.')
                {
                    if(box.contains(board[r1][c1]))
                    {
                        return false;
                    }
                    box.add(board[r1][c1]);
                }
            }
        }
        return true;
    }
}