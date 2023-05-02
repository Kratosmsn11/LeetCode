class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int currColor = image[sr][sc];
        if(currColor != color) dfs(image, sr, sc, currColor, color);
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int currColor, int color){
        if(image[sr][sc] == currColor){
            image[sr][sc] = color;
            if(sr >= 1) dfs(image, sr-1, sc, currColor, color);
            if(sc >= 1) dfs(image, sr, sc-1, currColor, color);
            if(sr+1 < image.length) dfs(image, sr+1, sc, currColor, color);
            if(sc+1 < image[0].length) dfs(image, sr, sc+1, currColor, color);
        }
    }
}
