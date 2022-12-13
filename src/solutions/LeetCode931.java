package solutions;

public class LeetCode931 {

    public static int minFallingPathSum(int[][] matrix) {
        if(matrix.length == 0)
            return 0;
        int res = Integer.MAX_VALUE;
        for(int i=matrix.length-2;i>=0;i--){
            for(int j=0;j<matrix[0].length;j++){
                if(j == 0)
                    matrix[i][j] += Math.min(matrix[i+1][j],matrix[i+1][j+1]);
                else if(j == matrix[0].length - 1)
                    matrix[i][j] += Math.min(matrix[i+1][j-1],matrix[i+1][j]);
                else
                    matrix[i][j] += Math.min(Math.min(matrix[i+1][j-1],matrix[i+1][j]),matrix[i+1][j+1]);
            }
        }
        for(int val : matrix[0])
            res = Math.min(res,val);
        return res;
    }

    public static void main(String args[]){
        int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        System.out.println("Minimum patth falling sum of matrix is : "+minFallingPathSum(matrix));
    }
}
