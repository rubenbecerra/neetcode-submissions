class Twitter {
    private int timestamp;
    private HashMap<Integer, List<Tweet>> tweetMap;
    private HashMap<Integer, Set<Integer>> followingMap;

    private class Tweet {
        int tweetId;
        int time;

        public Tweet(int tweetId, int time) {
            this.tweetId = tweetId;
            this.time = time;
        }
    }

    public Twitter() {
        timestamp = 0;
        tweetMap = new HashMap<>();
        followingMap = new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        tweetMap.putIfAbsent(userId, new ArrayList<>());
        tweetMap.get(userId).add(new Tweet(tweetId, timestamp++));
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> res = new ArrayList<>();
        PriorityQueue<Tweet> maxHeap = new PriorityQueue<>((a, b) -> b.time - a.time);
        
        followingMap.putIfAbsent(userId, new HashSet<>());
        followingMap.get(userId).add(userId);
        
        for (int followeeId : followingMap.get(userId)) {
            List<Tweet> tweets = tweetMap.get(followeeId);
            if (tweets != null) {
                for (Tweet tweet : tweets) {
                    maxHeap.offer(tweet);
                }
            }
        }
        
        int count = 0;
        while (!maxHeap.isEmpty() && count < 10) {
            res.add(maxHeap.poll().tweetId);
            count++;
        }
        
        return res;
    }
    
    public void follow(int followerId, int followeeId) {
        followingMap.putIfAbsent(followerId, new HashSet<>());
        followingMap.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if (followingMap.containsKey(followerId) && followerId != followeeId) {
            followingMap.get(followerId).remove(followeeId);
        }
    }
}