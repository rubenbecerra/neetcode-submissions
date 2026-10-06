class Solution {
    public int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        int maxNum = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length -1) {
                result[i] = -1;
            } else {
                result[i] = maxNum;
            }
            maxNum = Math.max(maxNum, arr[i]);
        }
        return result;
    }
}