class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                int startIndex = mid;
                int endIndex = mid;
                while(startIndex > 0 && nums[startIndex - 1] == target) startIndex--;
                while(endIndex < nums.length - 1 && nums[endIndex + 1] == target) endIndex++; 
                return new int[]{startIndex, endIndex};
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}