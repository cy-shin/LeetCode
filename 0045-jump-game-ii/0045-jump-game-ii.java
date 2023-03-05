class Solution {
    public int jump(int[] nums) {
        if(nums.length<=1) return 0;
        int[] dp = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<=Math.min(i+nums[i], dp.length); j++){
                if(dp[j]==0){
                    dp[j] = dp[i] + 1;
                }              
                if(j==nums.length-1) break;
            }
            if(dp[nums.length-1]!=0){
                break;
            }
        }

        return dp[nums.length-1];
    }
}