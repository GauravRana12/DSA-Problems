class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int start=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==0 && start<n){
                nums1[i]=nums2[start];
                start++;
            }
        }
        Arrays.sort(nums1);
        
        
    }
}