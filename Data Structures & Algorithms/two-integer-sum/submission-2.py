class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n=len(nums)
        sum=0
        ans=[]
        for i in range(0,n):
            for j in range(i+1,n):
                sum=nums[i]+nums[j];
                if(sum==target):
                    ans=[i,j]
                    return ans;
        return ans;