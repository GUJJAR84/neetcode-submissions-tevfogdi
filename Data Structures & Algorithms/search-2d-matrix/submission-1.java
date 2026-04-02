class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        // int i = 0;
        // while(i<n){
        //     if(matrix[i][m-1]==target){
        //         return true;
        //     }else if(matrix[i][m-1]>target){
        //         for(int j=0;j<m-1;j++){
        //             if(matrix[i][j]==target) return true;
        //         }return false;
        //     }else{
        //         i++;
        //     }
        // }
        // return false;
        int l=0;
        int r=n-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(target<matrix[mid][0]){
                r = mid-1;
            }
            else if(target>matrix[mid][m-1]){
                l=mid+1;
            }
            else{
                int a = 0;
                int b = m-1;
                while(a<=b){
                    int mi = a+(b-a)/2;
                    if(matrix[mid][mi]==target){
                        return true;
                    }
                    else if(matrix[mid][mi]<target){
                        a=mi+1;
                    }else{
                        b = mi-1;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
