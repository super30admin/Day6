//TC: O(n) where n is number of elements
//SC: O(n) where n is number of elements

class Solution {
public:
    int findMaxLength(vector<int>& nums) {  
        
        //create a hashmap to store the first occurences of any new cumulative sum term. We then check first if the sum up to that point is 0. If yes, then the maxlen is that index+1. If no, then we check if the cumulative sum has been previously encountered. If yes, then we find the distance between the first encounter and current index and check if this is greater than the current maxlen. The greater value is then passed to maxlen.
        unordered_map<int, int> hmap;
        int maxlen = 0;
        int sum = 0;
        
        if(nums.empty() == true)
            return 0;
        
        for(int i=0; i<nums.size(); i++){
            if(nums[i] == 0)
                sum += -1;
            else sum += 1;
            
            if(sum == 0)
                maxlen = i+1;
            
            else if(hmap.find(sum) != hmap.end()){
                maxlen = max(maxlen, i-hmap[sum]);
            } 
            //if the cumulative sum is seen for the first time, then add this to the map.
            else hmap[sum] = i;
            
        }
        
        return maxlen;
        
    }
};