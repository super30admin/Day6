
// Time Complexity : O(n) n is the size of vector.
// Space Complexity : O(1) hashmap of 0 and 1 earliest occurence. 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None



class Solution {
    unordered_map<int,int>prefixsum;   // sum and index( earliest );
public:
    
    int answer = 0;
    int findMaxLength(vector<int>& nums) {
        int sum = 0;
        prefixsum.insert(  pair(sum, -1 )); // to handle edge case
        // for each 0 count sum as -1
        for( int i=0; i<nums.size(); i++ ){
            if( nums[i] == 0 ) {
                  sum -= 1;
            } else {
                  sum += 1;
            } 
            if( prefixsum.find( sum ) == prefixsum.end() ){
               prefixsum.insert( pair( sum, i ) );
            } else {
                answer = max( answer, i - prefixsum[sum]);
            }
            
        }
        return answer;
    }
};
