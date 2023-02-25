class Solution {
    public String reverseWords(String s) {
        int keepIndex = -1;
        char[] charArr = s.toCharArray();
        int size = s.length();
        for(int i = 0; i <= size; i++) {
            if(i == size || charArr[i] == ' ') {
                int startIndex = keepIndex + 1;
                int endIndex = i - 1;
                while(startIndex < endIndex) {
                    char temp = charArr[startIndex];
                    charArr[startIndex] = charArr[endIndex];
                    charArr[endIndex] = temp;
                    startIndex++;
                    endIndex--;
                }
                keepIndex = i;
            }
        }
        return String.valueOf(charArr);
    }
}