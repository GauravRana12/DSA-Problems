class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int max=0;
        int ans=0;
        for(Map.Entry<Integer,Integer> m: map.entrySet()){
            if(m.getValue()>max){
                max=m.getValue();
                ans=m.getKey();
            }
        }
        return ans;
    }
}