class Solution {
    
        public int mostWordsFound(String[] sentences) {
        int count = 0;
        for(int i = 0; i< sentences.length;i++){
            count = Math.max(count,countwords(sentences[i]));
        }
        return count;
    }
     private int countwords(String str){
        int w=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                w++;
            }
        }
        w++;
        return w;
    }
}