class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        for (int freq : freqMap.values()) {
            if (freq == 1) {
                return -1; 
            }
            count += Math.ceil((double) freq / 3);
        }

        return count;
    }
}