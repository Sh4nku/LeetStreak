class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0;
        int right = (row * col) -1;
        while(left <= right){
            int mid = left + (right -left)/ 2;
            
            int rows = mid/col;
            int cols = mid%col;  
            
            int val = matrix[rows][cols];
            if(val == target){ return true;}
            if(val < target){ left =  mid+1 ;}
            if(val > target){ right = mid -1; } 
        }
        return false;
    }
}