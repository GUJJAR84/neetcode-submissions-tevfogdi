class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;
        for(int i=0;i<details.length;i++){
            String s = ""+details[i].charAt(11)+details[i].charAt(12);
            if(Integer.parseInt(s)>60){
                ans++;
            }
        }
        return ans;
    }
}