/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraySum = function(nums, k) {
    if(nums == null || nums.length ==0) return 0;
    let map = new Map();
    //running sum
    let rSum = 0;
    let no_of_subarrays = 0;
    //Initially setting the rSum value to no of times the rsum has occured(no.of arrays)     in the map.
    map.set(0,1);
    for(i=0; i< nums.length; i++){
        rSum = rSum + nums[i];
        //compliment
        let compliment = rSum-k;
        if(map.has(compliment)){
            no_of_subarrays +=map.get(compliment);
            
        }
        if(map.get(rSum)){
            map.set(rSum,map.get(rSum)+1);
        } else {
            map.set(rSum,1);
        }
    }
return no_of_subarrays;
    
};

//Time Complexity : O(n) - As we have to iterate through the entire array of n elements size.
// Space Complexity : Constant. Irrespective of the length of the string.