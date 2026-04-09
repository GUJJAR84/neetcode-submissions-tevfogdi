class Solution {
    public int maxArea(int[] nums) {
        int l =0;
        int n= nums.length;
        int r = n-1;
        int maxS = 0;
        while(l<r){
            int h= Math.min(nums[r],nums[l]);
            maxS = Math.max(maxS,h*(r-l));
            if(nums[l]<nums[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxS;
    }
}
