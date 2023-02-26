class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> diffirentCandyType = new HashSet<>();
        
        for(int i : candyType) {
            diffirentCandyType.add(i);
        }
        
        int result = Math.min(diffirentCandyType.size(), candyType.length / 2);
        
        return result;
    }
}