class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0;
        while(i<n){
            if(matrix[i][m-1]==target){
                return true;
            }else if(matrix[i][m-1]>target){
                for(int j=0;j<m-1;j++){
                    if(matrix[i][j]==target) return true;
                }return false;
            }else{
                i++;
            }
        }
        return false;
    }
}
