class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int numLast = image[0].length - 1;
        for(int i = 0; i < image.length; i++) {
            int j = 0; 
            int k = image[i].length - 1;
            while(j <= k) {
                if(j==k) {
                    image[i][j] = image[i][j] == 0 ? 1 : 0;
                    break;
                }
                int temp = image[i][j];
                image[i][j] = image[i][k] == 0 ? 1 : 0;
                image[i][k] = temp == 0 ? 1 : 0;
                j++;
                k--;
            }
        }
        return image;
    }
}