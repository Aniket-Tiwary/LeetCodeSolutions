package leetcode75challenge;

import java.util.Arrays;

public class LeetCode733 {

    public static void changeColor(int[][] image,int row,int col,int color,int[][] visited,int og){
        if(row < 0 || row >= image.length || col < 0 || col >= image[0].length)
            return;
        if(image[row][col] != og)
            return;
        if(visited[row][col] == 1)
            return;
        else
            visited[row][col] = 1;
        image[row][col] = color;
        changeColor(image,row-1,col,color,visited,og);
        changeColor(image,row,col-1,color,visited,og);
        changeColor(image,row,col+1,color,visited,og);
        changeColor(image,row+1,col,color,visited,og);
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image.length == 0)
            return image;
        if(image[sr][sc] == color)
            return image;
        int[][] visited = new int[image.length][image[0].length];
        changeColor(image,sr,sc,color,visited,image[sr][sc]);
        return image;
    }

    public static void main(String args[]){
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        floodFill(image,1,1,2);
        for(int[] ele : image){
            System.out.println(Arrays.toString(ele));
        }

    }
}
