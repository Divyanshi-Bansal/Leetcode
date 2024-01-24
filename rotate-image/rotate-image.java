class Solution {
    public void rotate(int[][] matrix) {
        
        //i [[1,2,3],[4,5,6],[7,8,9]]
//        o  [[7,4,1],[8,5,2],[9,6,3]]
        
        int row = matrix.length;//3
        int col = matrix[0].length;//3
        int[][] matrix2 = new int[row][col];
        int indexC = col-1;//2
        for (int i = 0; i<row;i++){
            int indexR = 0;
            for(int j=0;j<col;j++){
                matrix2[indexR][indexC] = matrix[i][j];
                indexR++;
            }
            indexC--;
        }
        for (int i = 0; i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = matrix2[i][j];
            }
        }
        
        
        
    }
}