// Time Complexity : O(n) we loop through the array once
// Space Complexity : O(n) cause we used map
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No
//Approach
// we will store the running sum & earliest index in map
// we will inc by 1 if 1 is there for 0 we will decrement by 1
//if we find the same rSum in map the we will update the length to the max
class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        map<int,int>mpp; //runningSum & earliestIndex
        int rSum =0;
        int length =0;
        mpp[0] = -1;
        for(int i =0;i<nums.size();i++){
            if(nums[i]==0) rSum--;
            else rSum++;

            if(mpp.count(rSum) > 0){
                length = max(length,i-mpp[rSum]);
            }
            else{
               mpp[rSum] =i;
            }
        }
        return length;
    }
};