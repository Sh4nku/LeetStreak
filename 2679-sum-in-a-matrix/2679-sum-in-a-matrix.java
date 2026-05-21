class Solution {
    public int matrixSum(int[][] nums) {
//  7  2  1
//  6  4  2
//  6  5  3
//  3  2  1

        int row = nums.length;
        int col = nums[0].length;

        for(int i = 0; i < row; i++){
            Arrays.sort(nums[i]);
        }

        int sum = 0;
        for(int j = 0; j < col; j++){
            int max = 0;
            for(int i = 0; i < row; i++){
                max = Math.max(max,nums[i][j]);
            }
            sum+= max;
        }
        return sum;
    }
}