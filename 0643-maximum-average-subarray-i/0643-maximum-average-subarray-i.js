/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findMaxAverage = function(nums, k) {
    var sum=0;
    for(let i=0;i<k;i++){
        sum+=nums[i];
    }
    var ans=-Infinity;
    let start=0;
    let end=k-1;
    while(end<nums.length){
        if(sum>ans){
            ans=sum;
            sum=sum-nums[start];
            start++;
            end++;
            sum=sum+nums[end];
        }
        else{
            sum=sum-nums[start];
            start++;
            end++;
            sum=sum+nums[end];
        }
    }
    return ans/k;
};