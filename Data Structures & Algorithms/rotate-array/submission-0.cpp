class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        
        int sp=-1;
        int n = nums.size();
        k=k%n;
        int i =0;
        int j = 0;
        while(n--){
            int next = (i+k)%nums.size();
            int p = nums[next];
            if(sp!=-1) nums[next] = sp;
            else nums[next] = nums[i];
            sp = p;
            i = next;
            if(i==j){
                i=j+1;
                j=j+1;
                sp=-1;
            }
        }
    }
};