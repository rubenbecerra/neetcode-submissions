class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> list = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int look = target - current;
            if (list.containsKey(look)) {
                return new int[]{list.get(look), i};
            }
            list.put(current,i);
        }
        return new int[0];
    }
}
