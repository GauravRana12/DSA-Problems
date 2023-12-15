class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        int str1=word1.length();
        int str2=word2.length();
        String str="";
        while(i<str1 && j<str2){
            str+=word1.charAt(i);
            str+=word2.charAt(j);
            i++;
            j++;
        }
        if(str1>str2){
            while(i<str1){
                str+=word1.charAt(i);
                i++;
            }
        }
        else{
            while(j<str2){
                str+=word2.charAt(j);
                j++;
            }
        }
        return str;
    }
}