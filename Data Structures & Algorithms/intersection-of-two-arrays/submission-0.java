class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        List<Integer> a = new ArrayList<>();

        if(n > m){
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(nums2[i] == nums1[j]){
                        if(!a.contains(nums2[i])){
                            a.add(nums2[i]);
                        }
                        break;
                    }
                }
            }
        }else{
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(nums1[i] == nums2[j]){
                        if(!a.contains(nums1[i])){
                            a.add(nums1[i]);
                        }
                        break;
                    }
                }
            }
        }

        int[] ans = new int[a.size()];
        for(int i=0;i<a.size();i++){
            ans[i] = a.get(i);
        }

        return ans;
    }
}