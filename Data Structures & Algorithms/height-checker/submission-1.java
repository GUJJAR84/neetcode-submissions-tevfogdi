class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int[] exp = new int[n];
        for(int i=0;i<n;i++){
            exp[i]=heights[i];
        }
        Arrays.sort(exp);
        int ans =0;
        for(int i=0;i<n;i++){
            if(exp[i]!=heights[i]){
                ans++;
            }
        }
        return ans;
    }
}