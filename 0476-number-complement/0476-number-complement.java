class Solution {
    public int findComplement(int num) {
        int todo = num , i = 0;
        while(todo > 0) {
            num ^= (1 << i);
            todo >>= 1;
            ++i;
        }
        return num;
    }
}