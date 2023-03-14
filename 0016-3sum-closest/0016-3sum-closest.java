class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[nums.length - 1];
        for(int i = 0; i < nums.length - 2; i++) {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j = i + 1, k = nums.length - 1;
            while(j < k) {
                int cur_sum = nums[i] + nums[j] + nums[k];
                if(cur_sum > target) k--;
                else j++;
                if(Math.abs(cur_sum - target) < Math.abs(sum - target)) sum = cur_sum;
            }
        }
        return sum;
    }
}