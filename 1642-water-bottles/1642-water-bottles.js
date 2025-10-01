/**
 * @param {number} numBottles
 * @param {number} numExchange
 * @return {number}
 */
var numWaterBottles = function(numBottles, numExchange) {
   var ans= Math.floor((numBottles-1)/(numExchange-1));
   return numBottles + ans;
};