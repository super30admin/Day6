
// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
/*Calculating running sum and storing it in hashmap.
 Subtracting k from it to see if it has already happened. This tells if that sum already happened
 and hence gives result*/
class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int cnt=0;
        int n = nums.size();
        unordered_map<int, int> m;
        int crSum=0;
        m.insert({crSum,1});

        for(int i=0; i<nums.size(); i++){
            crSum = crSum + nums[i];
            if(m.contains(crSum -k)){
                cnt= cnt + m[crSum -k];
            }
                if(m.contains(crSum)){
                    m[crSum]++;
                }
                else{
                    m[crSum] = 1;
                }
            }
        
        return cnt;
    }
};