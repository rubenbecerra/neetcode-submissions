class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        int open = 0;
        int closed = 0;
        String current = "";
        backtrack(open,closed, current, result, n);
        return result;
    }

    public void backtrack(int open, int closed, String current, List<String> result, int n) {
        if (open >= n && closed >= n) {
            result.add(current);
            return;
        }

        if (open < n) {
            backtrack(open + 1,closed, current + "(", result, n);
        } 
        if (closed < open) {
            backtrack(open,closed + 1, current + ")", result, n);
        }
        
    }
}
