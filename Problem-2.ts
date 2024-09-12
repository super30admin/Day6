// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes 
// Any problem you faced while coding this : it's failing when I am trying to submit in leet code
function findMaxLength(nums: number[]): number {
    let map = { 0: -1 };
    let count = 0;
    let maxLength = 0;

    for (let i = 0; i < nums.length; i++) {
        // if 0 decrease the count, or if 1 increase the count
        count = count + (nums[i] === 0 ? -1 : 1);
        // if count exists in the map then get the max
        if (map[count]) {
            maxLength = Math.max(maxLength, i - map[count]);
        } else if(count === 0){
            maxLength = i + 1;
        }
         else {
            // set the map to i 
            map[count] = i;
        }
    }
    return maxLength;
};