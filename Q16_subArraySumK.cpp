// ## Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)

// Time complexity: O(n)
// Space complexity: O(n)
// Idea- to maintain running sum and check how many times the same sum is occuring



class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        
        if(nums.size() ==0 ){
            return 0;
        }
        
        int rsum=0;
        int count =0;
        
        //map to store key as rsum and count
        unordered_map< int, int > m1;
        
        m1[0]= 1;
        
        
        for(int i=0; i< nums.size() ; i++){
            rsum += nums[i];
            
            if(m1.find(rsum-k) != m1.end()){
                count+= m1[rsum-k];
            }
            
            if(m1.find(rsum) != m1.end()){
                m1[rsum] += 1;
            }
            
            else {
                
                m1[rsum] =1;


           }
        }
        return count;
    }
};