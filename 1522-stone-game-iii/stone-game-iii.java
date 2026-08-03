class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n,i,k;
        int min = stoneValue[0];
        n = stoneValue.length;
        int[] dp = new int[n+1];
        for(i=n-1;i>=0;i--){
            dp[i] = Integer.MIN_VALUE;
            int sum = 0;
            for(k=0;k<3 && i+k<n;k++){
                sum += stoneValue[i+k];
                dp[i] = Math.max(dp[i], sum - dp[i+k+1]);
            }
        }
        if(dp[0]>0)
            return("Alice");
        else if(dp[0]<0)
            return("Bob");
        else
            return("Tie");
    }
}