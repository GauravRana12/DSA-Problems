class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=g.length;
        int N=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int start=0;
        int start2=0;
        int ans=0;
        while(start<n && start2<N){
            if(g[start]<=s[start2]){
                start++;
                start2++;
                ans++;
            }
            else{
                start2++;
            }
        }
        return ans;
    }
}