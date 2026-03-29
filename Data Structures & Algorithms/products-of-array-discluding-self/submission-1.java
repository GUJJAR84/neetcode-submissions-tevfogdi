class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int n=nums.length;
        // int ans[]= new int[n];
        // for(int i=0;i<n;i++){
        //     int p=1;
        //     for(int j=0;j<n;j++){
        //         if(i==j)continue;
        //         else{
        //             p *= nums[j];
        //         }
        //     }
        //     ans[i]=p;
        // }
        // return ans;

        int n=nums.length;
        int res[]= new int[n];
        res[0]= 1;
        for(int i=1;i<n;i++){
            res[i]= res[i-1]*nums[i-1];
        }
        int right = 1;
        for(int i=n-1;i>=0;i--){
            res[i]*=right;
            right*=nums[i];
        }
        return res;
    }
}  
