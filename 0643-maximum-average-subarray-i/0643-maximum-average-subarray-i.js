/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findMaxAverage = function(nums, k) {
    let tot = 0;
    for (let i= 0; i < k ; i++)
    {
        tot += nums[i];
    }

    let ans = tot / k;
    
    for (i = k; i < nums.length; i++)
    {
       tot += nums[i] - nums[i - k];
       ans = Math.max(ans, tot/k);
        
    }
    return ans;
};