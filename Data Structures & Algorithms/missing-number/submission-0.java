class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n=nums.length;
        int total = (n*(n+1))/2;
        for(int num: nums){
            sum+=num;
        }
        int missing = total-sum;
        return missing;
    }
}
