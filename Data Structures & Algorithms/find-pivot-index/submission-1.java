class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        int lsum=0;
        int rsum=sum;
        int i=0;
        while(i<nums.length){
            rsum = rsum - nums[i];
            if(lsum==rsum){
                return i;
            }
            lsum+=nums[i];
            i++;
        }
        return -1;
    }
}