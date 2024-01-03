class Solution {
    public int numberOfBeams(String[] bank) {
        int count=0,ans=0,prev=0;
        for(String str:bank){
            count=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='1') count++;
            }
            if(count>0){
                ans+=prev*count;
                prev=count;
            }
        }
        
        return ans;
    }
}