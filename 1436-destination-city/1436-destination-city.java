class Solution {
    public String destCity(List<List<String>> path) {
        Set<String> hs=new HashSet();
        for(int i=0;i<path.size();i++){
            hs.add(path.get(i).get(0));
        }
        for(int i=0;i<path.size();i++){
            String str=path.get(i).get(1);
            if(!hs.contains(str)){
                return str;
            }
        }
        return "";
    }
}