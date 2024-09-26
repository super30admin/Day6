//// Time Complexity : O(n)
//// Space Complexity : O(n)
//// Did this code successfully run on Leetcode : yes
//// Any problem you faced while coding this :
// Huge mental leaps to understand the approach
// Initializing the hashmap with sum 0: count 1 I missed the importance of

//// Your code here along with comments explaining your approach
// Initialize a running sum which we update as we loop, starting at 0
// Initialize the count which we will return ultimately, starts at 0
// Initialize a hashmap that maps from sum: count_of_subarrays

// for each number, index
//   sum += number
//   complement = sum - k, complement is the value needed to satisfy k

//   if hashmap has complement
//     count += hash.get(sum) you have a value to satisfy k so add the number of subarrays already found for sum

//   // Below either add a new entry or update the existing entry
//   if !hashmap.has(sum)
//     hashmap.set(sum, 1)
//   else
//     hashap.set(sum, hashmap.get(sum) + 1)

// return count
var INITIAL_COUNT, subarraySum;

INITIAL_COUNT = 1;

subarraySum = function(nums, k) {
  var count, mapSumToCount, sum;
  sum = 0;
  count = 0;
  mapSumToCount = new Map([[0, 1]]);
  nums.forEach(function(num) {
    var complement, updatedCount;
    sum += num;
    complement = sum - k;
    if (mapSumToCount.has(complement)) {
      count += mapSumToCount.get(complement);
    }
    updatedCount = INITIAL_COUNT;
    if (mapSumToCount.has(sum)) {
      updatedCount = mapSumToCount.get(sum) + 1;
    }
    return mapSumToCount.set(sum, updatedCount);
  });
  return count;
};

//subarraySum([1, 1, 1], 2)

//# sourceMappingURL=problem1.js.map
