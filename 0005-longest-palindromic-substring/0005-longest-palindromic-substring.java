class Solution {
    
    public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        int max=0;
        String maxStr="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String str=s.substring(i,j);
                if(palindorme(str)){
                   if(max<str.length()){
                       maxStr=str;
                       max=str.length();
                   }
                }
            }
        }
        return maxStr;
    }
    public static boolean palindorme(String str){
        int start=0;
        int end=str.length()-1;
        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}