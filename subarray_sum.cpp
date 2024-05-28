//Time = O(n)
//Space = O(n)
//Leetcode : yes
// Issue seen: none

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int sum = 0;
        int balance = 0;
        int count = 0;
        //it will keep count of progressive sum and its count
        unordered_map <int, int > mp;

        //add entry for sum = 0 in mp
        mp[0] = 1;
        for(int i = 0; i< nums.size(); i++) {
           sum = sum + nums[i];
           balance = sum - k;
           if(mp.find(balance) != mp.end()){
            //we found one subarray that has sum - balance = k, increment the count
            count = count + mp[balance];
           }
           mp[sum] = mp[sum] + 1;
        }
        return count;
        
    }
};
