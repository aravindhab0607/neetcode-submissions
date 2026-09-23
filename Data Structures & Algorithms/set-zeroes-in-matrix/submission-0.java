class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rowSet = new HashSet<Integer>();
        HashSet<Integer> columnSet = new HashSet<Integer>();
        for( int i = 0; i < matrix.length; i++){
            for( int j = 0; j < matrix[i].length; j++){
                if( matrix[i][j] == 0 ){
                    rowSet.add( i );
                    columnSet.add(j);
                }
            }
        }

        for( int currentRow : rowSet ){
            for( int j = 0; j < matrix[currentRow].length; j++){
                matrix[currentRow][j] = 0;
            }
        }

        for( int currentRow : columnSet ){
            for( int j = 0; j < matrix.length; j++){
                matrix[j][currentRow] = 0;
            }
        }
    }
}
