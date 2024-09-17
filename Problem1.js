//Time: O(n), Space: O(n)
// Runs on leetcode - solution accepted

var subarraySum = function(nums, k) {
    let r_sum =0;
    let hash_map = {'0': 1};
    let count =0;
    for(let i=0;i<nums.length;i++){
        r_sum = r_sum + nums[i]
        let diff = (r_sum - k);
        if(diff in hash_map){
            count += hash_map[diff] ?? 0 ;
        }
        hash_map[r_sum] = ++hash_map[r_sum] || 1;
    }
    return count
};