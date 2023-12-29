class Solution {
    public int lengthOfLastWord(String s) {
     int idx=s.length()-1;
        int len=0;
        while(idx>=0 && s.charAt(idx)==' '){
            idx--;
        }
        while(idx>=0 && s.charAt(idx)!=' '){
            len++;
            idx--;
        }
        return len;
    }
}