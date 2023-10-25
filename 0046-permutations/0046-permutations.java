class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> permutations = new ArrayList<>();
        backtrack(res, nums, permutations);
        return res;
    }
    
    void backtrack(List<List<Integer>> res, int[] nums, List<Integer> permutations) {
        if(permutations.size() == nums.length) {
            res.add(new ArrayList<>(permutations));
        } else {
            for(int i = 0; i < nums.length; i++) {
                if(!permutations.contains(nums[i])) {
                    permutations.add(nums[i]);
                    backtrack(res, nums, permutations);
                    permutations.remove(permutations.size() - 1);
                }
            }
        }
    }
}