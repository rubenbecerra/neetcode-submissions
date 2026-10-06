class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> list = new HashSet<>();
        for (int num : nums) {
            list.add(num);
        }
        int maxConsec = 0;
        int start = 0;

        for (int num : nums) {
            if (!list.contains(num - 1)) {
                int currentNum = num;
                int current = 1;

                while (list.contains(num + 1)) {
                    current++;
                    num++;
                }
                maxConsec = Math.max(maxConsec, current);
            }
                
        }
        return maxConsec;

    }
}
