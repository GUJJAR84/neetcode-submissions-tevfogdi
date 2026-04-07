class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int l =1;
        int r = 0;
        for(int p: piles){
            r=Math.max(r,p);
        }
        int ans=0;
        while(l<=r){
            int mid = l+(r-l)/2;
            int hr=0;
            for(int p: piles){
                hr+=(p+mid-1)/mid;
            }
            if(hr<=h){
                ans=mid;
                r = mid-1;
            }else if(hr>h){
                l=mid+1;
            }
        }
        return ans;
    }
    // public int eatB(int rate,int[] piles){
    //     int hrs =0;
    //     for(int p: piles){
    //         hrs+=(p+rate-1)/rate;
    //     }
    //     return hrs;
    // }
}
