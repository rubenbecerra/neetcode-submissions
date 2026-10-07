class Solution {
    public double averageWaitingTime(int[][] customers) {
        long sum = 0;
        int time = customers[0][0];
        for (int i = 0; i < customers.length; i++) {
            if (time < customers[i][0]) {
                time = customers[i][0];
            }
            time += customers[i][1];
            long waitTime = (long) time - customers[i][0];
            sum += waitTime;
        }
        return (double) sum / customers.length;
    }
}