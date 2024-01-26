/**
 * @param {number[]} nums
 * @return {number[]}
 */
var numberGame = function(nums) {
   let res = []
    let alice, bob
    nums.sort( (a, b) => a - b)
    for(let i = 0; i < nums.length; i += 2){
        alice = nums[i]
        bob = nums[i + 1]
        res.push(bob)
        res.push(alice)
    }
    return res
};