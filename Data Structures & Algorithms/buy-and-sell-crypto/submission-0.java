class Solution {
    public int maxProfit(int[] nums) {
        int profit = 0;
        int n = nums.length;
        int maxP = Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                profit = nums[j]-nums[i];
                if(maxP < profit){
                    maxP = profit;
                }
            }
        }
        if(maxP<0)return 0;
        return maxP;
    }
}
