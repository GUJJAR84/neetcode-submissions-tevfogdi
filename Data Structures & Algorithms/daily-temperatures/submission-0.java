class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n= temp.length;
        int ans[]= new int[n];
        int i=0;
        while(i<n){
            boolean found =false;
            for(int j=i+1;j<n;j++){
                if(temp[i]<temp[j]){
                    ans[i]=j-i;
                    found = true;
                    break;
                }
            }
            if(!found){
                ans[i]=0;
            }
            i++;
        }
        return ans;
    }
}
