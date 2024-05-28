//Time O(n)
//Space O(n)
//Leetcode : yes
//issue seen : none

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        map<int,int> mp;
        mp[0] = -1;
        int maxLen = 0;
        int sum=0;
        for(int i=0; i<nums.size(); i++){
           sum = sum + (nums[i]==1 ? 1 : -1);
            
            if(mp.find(sum) != mp.end()){
               maxLen = max(maxLen, i-mp[sum]);
            } else {
               mp[sum] = i;
            }
        }
        return maxLen;
    }
        
    
};
