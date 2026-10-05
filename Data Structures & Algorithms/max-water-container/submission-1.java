class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentArea = Math.min(heights[left], heights[right]) * (right - left);
            if (currentArea >= maxArea) {
                maxArea = currentArea;
            }
            if (heights[left] <= heights[right]) {
                left++;
            } else if (heights[left] > heights[right]) {
                right--;
            }
            
        }
        return maxArea;
    }
}
