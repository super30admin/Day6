
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach 
/* Mapping running sum with indices of array by considering adding -1 for 0 and 1 for 1 occurrence 
Maximizing its difference with mapped index and index of array */
class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        int n = nums.size();
        unordered_map<int,int> rMap;

        int rSum =0;
        rMap.insert({rSum,-1});
        int max_length = 0;
        for(int i=0; i<n; i++){
            if(nums[i]==0){
                rSum-= 1;
            }
            else{
                rSum+= 1;
            }
            if(rMap.contains(rSum)){
                int rIndex = rMap[rSum];
                max_length = max(max_length,i-rIndex);
            }
            else{
                rMap.insert({rSum,i});
            }
        }
        return max_length;
    }
};