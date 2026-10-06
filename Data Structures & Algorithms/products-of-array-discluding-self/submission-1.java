class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int leftPrefix = 1;
        int rightPrefix = 1;

        for (int i = 0; i < nums.length; i++) {
            left[i] = leftPrefix;
            leftPrefix = leftPrefix * nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            right[i] = rightPrefix;
            rightPrefix = rightPrefix * nums[i];
        }

        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[i] = left[i] * right[i];
        }
        return output;

    }
}  
