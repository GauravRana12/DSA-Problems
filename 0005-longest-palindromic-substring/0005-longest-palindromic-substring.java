class Solution {
 int start = 0;
    int end = 0;

    private void isPalindrome(char ch[], int i){

        int a=i, b=i;
        int n=ch.length;

        if(i >= n-1) return;

        while(b < n-1 && ch[b] == ch[b+1])
            b++;

        i=b;

        while(a > 0 && b < n-1 && ch[a-1] == ch[b+1]){
            a--;
            b++;
        }

        if((end-start) < (b-a)){
            start = a;
            end = b;
        }

        isPalindrome(ch, i+1);
    }

    public String longestPalindrome(String s) {
        char[] ch = s.toCharArray();
        isPalindrome(ch, 0);
        return s.substring(start, end+1);
    } 
}