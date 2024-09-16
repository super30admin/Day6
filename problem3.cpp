
//time complexity :o(n)
//space complexity : o(n)
//Appraoch : using map for store the rsum value and we are checking the rsum is present or not if present then add to count.

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        
        if(nums.size() == 0) return -1;
        unordered_map<int,int> map;
        
        map[0] = 1;
        int n = nums.size();
        
        int count = 0;
        int rsum = 0;
        for(int i =0;i<n;i++) {
            rsum  += nums[i];
            
            if(map.find(rsum-k) != map.end()){
                count = count + map[rsum-k];
            } 
            
            if (map.find(rsum) == map.end()){
                    map[rsum] = 1;
                } else {
                    map[rsum] = map[rsum] + 1;
                }
        }
        return count;
        
    }
};