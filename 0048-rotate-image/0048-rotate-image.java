class Solution {
    public void rotate(int[][] matrix) {
        //Step 1 : Transpose the matrix 
        // means row become column and column become row 
        //Step 2 : Reverse the matrix horizontally

//Step1
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
            int temp = matrix[i][j];

            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
        }


//Step 2
        
        for(int i=0;i<matrix.length;i++){
            int scol=0;
            int ecol = matrix.length-1;
            while(scol < ecol){
                int temp = matrix[i][scol];
                matrix[i][scol] = matrix[i][ecol];
                matrix[i][ecol] = temp;
                scol++;
                ecol--; 
            }

        }  
        return;
  }

}