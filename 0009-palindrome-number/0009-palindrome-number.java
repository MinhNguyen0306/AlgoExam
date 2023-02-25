class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) return false;
        
        int new_number = 0;
        while(x > new_number) {
            new_number = new_number * 10 + (x % 10);
            x /= 10;
        }

        return x == new_number / 10 || x == new_number;
    }
}