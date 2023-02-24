class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int sizeCandies = candies.length;
        List<Boolean> result = new ArrayList<>(sizeCandies);
        int max = candies[0];
        
        for(int i = 1; i < sizeCandies; i++) {
            if(candies[i] > max) max = candies[i];
        }
        
        for(int candie : candies) {
            result.add((candie + extraCandies) >= max);
        }
        return result;
    }
}