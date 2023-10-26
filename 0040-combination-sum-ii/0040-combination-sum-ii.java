class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0, res, combination, candidates, target);
        return res;
    }
    
    private void backtrack(int pos, List<List<Integer>> res, List<Integer> combination, int[] candidates, int target) {
        if(target == 0) {
            res.add(new ArrayList<>(combination));
            return;
        }    
        
        if(target < 0) return;
        
        if(pos == candidates.length) return;
        
        int temp = pos;
        while(temp < candidates.length - 1 && candidates[temp] == candidates[temp+1]) temp++;
        
        int step = temp - pos + 1;
        backtrack(pos + step, res, combination, candidates, target);
        
        combination.add(candidates[pos]);
        backtrack(pos + 1, res, combination, candidates, target - candidates[pos]);
        combination.remove(combination.size() - 1);
    }
}