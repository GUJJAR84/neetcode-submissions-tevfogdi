class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        Stack<Character> seq = new Stack<>();
        for(int i=n-1;i>=0;i--){
            seq.push(s.charAt(i));
        }
        if(seq.isEmpty())return true;
        for(int i=0;i<m;i++){
            if(!seq.isEmpty() && seq.peek()==t.charAt(i)){
                seq.pop();
            }
        }
        return seq.isEmpty();
    }
}