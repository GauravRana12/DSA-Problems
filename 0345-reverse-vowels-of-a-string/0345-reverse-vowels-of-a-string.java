class Solution {
    public String reverseVowels(String s) {
        char[] ch=new char[s.length()];
        
        for(int i=0;i<s.length();i++){
         ch[i]=s.charAt(i);   
        }
        int start=0;
        int end=s.length()-1;
        String vowels="aeiouAEIOU";
        
        while(start<end){
            while(start<end && !vowels.contains(ch[start]+"")) start++;
            while(end>start && !vowels.contains(ch[end]+"")) end--;
            
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        String str="";
        for(int i=0;i<s.length();i++){
            str+=ch[i];
        }
        return str;
    }
}