class Solution {
    public int numSteps(String s) {
        int carry = 0;
        int count = 0;
        for(int i=s.length()-1; i>0; i--){
            int bit = s.charAt(i) == '1' ? 1 : 0;
            if((bit ^ carry) == 0){
                count++;
            }
            else{
                carry = 1;
                count += 2;
            }
        }
        if(s.charAt(0)=='1' && carry==1){
            count++;
        }
        return count;
    }
}