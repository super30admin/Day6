// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
//Approach : Here we will use a map to store the element and runningSum till taht point
//After that we will check if running sum-target is in the mapif it is there we can create a subarray
//of cnt k and wil;l update the cnt.
class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        map<int,int>mpp;  //rSum and freq
        int cnt = 0;
        int rSum =0;
        mpp[0] =1;
        for(auto num:nums){
            rSum+=num;
            int cmp = rSum-k;
            if(mpp.find(cmp)!=mpp.end()){
            cnt+=mpp[cmp];
        }
        mpp[rSum]++;
        }
        return cnt;
    }
};