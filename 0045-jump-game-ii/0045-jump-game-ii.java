class Solution {
    public int jump(int[] nums) {
        int ans=0;
        int far=0;
        int end=0;
        for(int i=0;i<nums.length-1;i++){
            far=Math.max(far,i+nums[i]);
            if(far>=nums.length-1){
                ++ans;
                break;
            }
            if (i == end) {   // Visited all the items on the current level
        ++ans;          // Increment the level
        end = far; // Make the queue size for the next level
      }
        }
        return ans;
    }
}