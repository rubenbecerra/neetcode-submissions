class Solution {
    public int[] sortArray(int[] nums) {
        for (int num : nums) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    int helper = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = helper;
                }   
            }
        }
        return nums;
    }
}