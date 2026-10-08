class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num,0)+ 1);
        }
        for (int key : freqMap.keySet()) {
            if (freqMap.get(key) > nums.length/2) {
                return key;
            }
        }
        return 0;
    }
}