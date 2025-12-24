class Solution {
    public int[][] grid;
    public boolean isEqual(int rowb,int rowe,int colb,int cole){
        int val=grid[rowb][colb];
        for(int i=rowb;i<=rowe;i++){
            for(int j=colb;j<=cole;j++){
                if(grid[i][j]!=val){
                    return false;
                }
            }
        }
        return true;
    }
    public Node buildTree(Node root,int rowb,int rowe,int colb,int cole){
        if(isEqual(rowb,rowe,colb,cole)){
            return (grid[rowb][colb]==0)?new Node(false,true):new Node(true,true);
        }
        int center_row=(rowb+rowe)/2;
        int center_col=(colb+cole)/2;
        root.topLeft=buildTree(new Node(),rowb,center_row,colb,center_col);
        root.topRight=buildTree(new Node(),rowb,center_row,center_col+1,cole);
        root.bottomLeft=buildTree(new Node(),center_row+1,rowe,colb,center_col);
        root.bottomRight=buildTree(new Node(),center_row+1,rowe,center_col+1,cole);
        return root;
    }
    public Node construct(int[][] grid) {
        this.grid=grid;
        return buildTree(new Node(),0,grid.length-1,0,grid[0].length-1);
    }
}
