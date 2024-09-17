// Time: O(n), Space:O(n) 
// Solution runs on leetcode and is accepted as well
var findMaxLength = function(nums) {
    if(nums.length==0) return 0;
    let hash_map = {'0': -1}, running_sum=0,max_len=0
    for(let i=0;i<nums.length;i++){
        if(nums[i] == 1){
            running_sum++;
        }else{
            running_sum--;
        }
        if(running_sum in hash_map){
            max_len = Math.max(max_len , i - hash_map[running_sum])
        }else{
            hash_map[running_sum] = i
        }
    }
    return max_len
};