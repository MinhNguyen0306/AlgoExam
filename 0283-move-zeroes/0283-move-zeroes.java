class Solution {
    public void moveZeroes(int[] nums) {
        int countZero = 0;
        int size = nums.length;
        for(int i = 0; i < size; i++) {
            if(nums[i] == 0) {
                countZero++;
            }else if(nums[i] != 0 && countZero > 0){
                nums[i - countZero] = nums[i];
                nums[i] = 0;
            }
        }
    }
}