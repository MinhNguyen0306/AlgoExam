class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int stonesSize = stones.length();
        int jewelsSize = jewels.length();
        int result = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < jewelsSize; i++) {
            set.add(jewels.charAt(i));
        }
        for(int i = 0; i < stonesSize; i++) {
            if(set.contains(stones.charAt(i))) {
                result++;
            }
        }
        return result;
    }
}