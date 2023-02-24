class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if(right <= 9) {
            for(int i = 0; i < right; i++) result.add(i);
            return result;
        } else {
            for(int i = left; i <= right; i++) {
                if(i % 10 == 0) continue;
                if(checkDividing(i)) result.add(i);
            } 
        }
        return result;
    }
    
    boolean checkDividing(int num) {
        int temp = num;
        while(temp != 0) {
            // System.out.print(temp);
            if(temp % 10 == 0 || num % (temp % 10) != 0 ) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }
}