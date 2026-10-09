class NumArray {

    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;    
    }
    
    public int sumRange(int left, int right) {
        int totalSum = 0;
        while ( left <= right) {
            if (left == right) {
                totalSum += nums[right];
            } else {
                totalSum += nums[right] + nums[left];
            }
            left++;
            right--;
        }
        return totalSum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */