class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num :nums) {
            int seenBefore = map.getOrDefault(num, 0);
            count+= seenBefore;
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }
    
}