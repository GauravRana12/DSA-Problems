class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].contains(Character.toString(x))) arr.add(i);
        }
        return arr;
    }
}