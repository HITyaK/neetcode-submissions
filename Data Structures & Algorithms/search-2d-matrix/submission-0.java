class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length ;
        int m = matrix[0].length ;
        int no = (n * m) - 1 ;
        int l = 0 , r = no;
        while(l <= r){
            int mid = l + (r-l) / 2;
            int i = mid/m , j =mid%m;
            if(matrix[i][j] < target){
                l = mid+1;
            }
            else if(matrix[i][j] > target){
                r = mid-1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
