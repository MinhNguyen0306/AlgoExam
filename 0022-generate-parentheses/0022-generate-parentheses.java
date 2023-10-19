class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        String valid = "";
        int close = 0;
        int open = 0;
        backtrack(res, n, 0, 0, valid);
        return res;
    }
    
    void backtrack(List<String> res, int n, int open, int close, String valid) {
        if(valid.length() == n * 2) {
            res.add(valid);
            return;
        }
        
        if(open < n) backtrack(res, n, open + 1, close, valid + "(");
        if(close < open) backtrack(res, n, open, close + 1, valid + ")");
    }
}