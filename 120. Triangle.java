class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[][] dp = new int[n][n];
        List<Integer> lastrow = triangle.get(n-1);
        for(int i=0;i<n;i++){
            dp[n-1][i]=lastrow.get(i);
        }
        for(int i=n-2;i>=0;i--){
            List<Integer> currentrow = triangle.get(i);
            for(int j=0;j<=i;j++){
                int curr = currentrow.get(j);
                dp[i][j]=Math.min(dp[i+1][j], dp[i+1][j+1])+curr;
            }
        }
        
        return dp[0][0];
    }
}
