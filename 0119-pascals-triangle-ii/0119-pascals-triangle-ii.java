class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result=new ArrayList<>();
        if(rowIndex==0){
              result.add(1);
              return result;
        }
        if(rowIndex==1){
            result.add(1);
            result.add(1);
            return result;
        }
        long mul=(long) rowIndex;
        long div=0;
        long val=1;
        while(div<=(long)rowIndex){
            if(div==0){
                result.add(1);
                div++;
                continue;
            }
            val=val*mul/div;
            mul--;
            div++;
            result.add((int)val);
        }
        return result;
    }
}