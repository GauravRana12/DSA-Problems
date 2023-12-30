class Solution {
    public int majorityElement(int[] nums) {
        int cand=nums[0], occur=0;
        for (int i=1; i<nums.length; i++) {
            if (cand==nums[i]) {
                occur++;
            } else if(occur==0){
                cand=nums[i];
            } else {
                occur--;
            }
        }
        return cand;
    }
}