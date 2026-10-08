class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i],i);
        }
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int current = nums1[i];
            int startIndex = map.get(current);
            int nextGreater = -1;

            for (int j = startIndex; j < nums2.length; j++) {
                if (nums2[j] > current) {
                    nextGreater = nums2[j];
                    break;
                }
            }
            result[i] = nextGreater;

        }
        return result;
    }
}