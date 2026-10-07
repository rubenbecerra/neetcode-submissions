class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int current = 0;

        for (int num : nums) {
            if (num == 1) {
                current++;
            } else {
                current = 0;
            }
            maxCount = Math.max(maxCount, current);
        }
        return maxCount;
    }

}