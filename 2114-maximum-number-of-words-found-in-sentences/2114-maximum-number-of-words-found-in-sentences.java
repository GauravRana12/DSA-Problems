class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans=0;
        for(String s:sentences){
            String[] str = s.split("\\s+");
            ans=Math.max(str.length,ans);
        }
        return ans;
    }
}