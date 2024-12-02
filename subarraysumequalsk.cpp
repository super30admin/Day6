

// Time Complexity : O(n) n is the size of vector.
// Space Complexity : O(n) hashmap. 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Only after reading understood the hashmap prefix sum approach , implementing that crazy approach !!!


class Solution {
    
    unordered_map<int, int >prefixsum; // number & count 
    
public:
    int subarraySum(vector<int>& nums, int k) { 
        // nums length >=1 given 
        int count = 0;
        int sum = 0;
        for( int i=0; i<nums.size(); i++){
            sum += nums[i];
            if( sum == k ){
                count ++;
            }
            if( prefixsum.find( sum-k ) != prefixsum.end() ){
                count += prefixsum[sum-k];
            } 
            prefixsum[sum]++;
        }
        return count;
    }
};
