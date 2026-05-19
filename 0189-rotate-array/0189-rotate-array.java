class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        rotateArray(nums, 0, n-1);
        rotateArray(nums, 0, k-1);
        rotateArray(nums, k, n-1);
    }

    public void rotateArray(int [] nums, int left, int right){
            while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}