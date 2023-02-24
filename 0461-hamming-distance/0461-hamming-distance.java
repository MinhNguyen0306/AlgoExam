class Solution {
    public int hammingDistance(int x, int y) {
        // Lấy bit hợp x y
        int n = x^y;
        
        int count = 0;
        
        // Lặp để đếm số bit 1 trong hợp
        while(n != 0) {
            // Dùng bit của số 1 (0001) để làm đầu đếm
            if((n&1)==1) count++;
            // Dịch bit sang 1 đơn vị ở mỗi vòng lặp
            n = n >> 1;
        }
        return count;
    }
}