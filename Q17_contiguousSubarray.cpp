// ## Problem2 (https://leetcode.com/problems/contiguous-array/

// Time complexity: O(n)
// Space complexity: O(n)
// Idea- avoid brute force 2 pass with hash map to store rsum( running sum)

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        
        if(nums.size() ==0 ){
            return 0;
        }
        
        int rsum=0;
        int max_len =0;
        
        //map to store key as rsum and value as index where it occurs
        unordered_map< int, int > m1;
        
        m1[0]= -1;
        
        for (int i= 0 ; i< nums.size() ; i++){
        
            if(nums[i]==0){
                rsum = rsum -1;
            }
            else{
                rsum = rsum +1;
            }
            
            if( m1.find(rsum) !=m1.end()){
                max_len = max( max_len, i - m1[rsum]);
            }
            
            else{
                m1[rsum] = i;
            }
            
          
        }
      return max_len;
        
    }
};