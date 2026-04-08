class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // int count =0;
        // int n=nums.length;
        // int maxCount =0;
        // int ans=0;
        // if(n==1)return nums[0];
        // for(int i=1;i<n;i++){
        //     if(nums[i]==nums[i-1]){
        //         count++;
        //         if(count>maxCount){
        //             maxCount = count;
        //             ans = nums[i];
        //         }
        //     }else{
        //         count=0;
        //     }
        // }
        int n = nums.length;
        int ans =0;
        int count= 0;
        for(int num: nums){
            if(count==0){
                ans = num;
            }
            if(num==ans){
                count++;
            }else{
                count--;
            }
        }
        return ans;
    }
}