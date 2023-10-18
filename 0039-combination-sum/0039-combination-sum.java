class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Stack<Integer> combination = new Stack<>();
        backtrack(0, candidates, combination, target);
        return res;
    }
    
    void backtrack(int i, int[] candidates, Stack<Integer> combination, int target) {
        if(target == 0) {
            List<Integer> com = new ArrayList(combination);
            res.add(com);
            return;
        }
        
        if(target < 0) return;
        
        if(i == candidates.length) return;
        
        backtrack(i + 1, candidates, combination, target);
        
        combination.push(candidates[i]);
        backtrack(i, candidates, combination, target - candidates[i]);
        combination.pop();
    }
}