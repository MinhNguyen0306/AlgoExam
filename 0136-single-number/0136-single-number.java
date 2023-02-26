class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> vector = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(!vector.contains(nums[i])) {
                vector.add(nums[i]);
            } else {
                vector.remove(vector.indexOf(nums[i]));
            }
        }
        System.out.print(vector);
        return vector.get(0);
    }
}