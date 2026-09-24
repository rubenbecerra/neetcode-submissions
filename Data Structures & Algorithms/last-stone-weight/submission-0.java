class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b - a);
        
        for (int i = 0; i < stones.length; i++) {
            maxHeap.offer(stones[i]);
        }

        
        while (maxHeap.size() > 1) {
            int first = maxHeap.poll();
            int second = maxHeap.poll();

            if (first == second) {
                continue;
            } else if (first > second) {
                first = first - second;
                maxHeap.offer(first);
            } else if (second > first) {
                second = second - first;
                maxHeap.offer(second);
            }
        }

        if (maxHeap.size() == 0) {
            return 0;
        } else {
            return maxHeap.poll();
        }
    }
}
