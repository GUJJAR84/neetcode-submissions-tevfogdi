class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int l = 0;
        int r = n-1;
        int ans=Integer.MAX_VALUE;
        while(l<=r){
            int mid = l+(r-l)/2;
            ans =Math.min(nums[mid],ans) ;
            if((nums[l]<nums[mid] && nums[r]>nums[mid]) || (nums[l]>nums[mid] && nums[mid]<nums[r])){
                r = mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
}
