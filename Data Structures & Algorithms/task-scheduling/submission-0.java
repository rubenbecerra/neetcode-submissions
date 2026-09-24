class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for (char task :tasks) {
            count[task - 'A']++;
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b - a);
        for (int c : count) {
            if (c > 0) {
                maxHeap.offer(c);

            }
        }

        Queue<int[]> cooldownQueue = new LinkedList<>();
        int time = 0;
        while (!maxHeap.isEmpty() || !cooldownQueue.isEmpty()) {
            time++;

            if (!maxHeap.isEmpty()) {
                int currentFreq = maxHeap.poll();
                currentFreq--;

                if (currentFreq > 0) {
                    cooldownQueue.offer(new int[] {currentFreq, time + n});
                }
            }
            
            if (!cooldownQueue.isEmpty() && cooldownQueue.peek()[1] == time) {
                maxHeap.offer(cooldownQueue.poll()[0]);
            }
            
        }
        return time;
    }
}
