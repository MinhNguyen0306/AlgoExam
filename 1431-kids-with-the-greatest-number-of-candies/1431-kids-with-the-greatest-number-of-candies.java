class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        int max = Arrays.stream(candies).max().getAsInt();
        for(int candie : candies) {
            result.add((candie + extraCandies) >= max);
        }
        return result;
    }
}