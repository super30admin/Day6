//TC: O(n) where n is number of elements
//SC: O(n) for n elements in the hashmap

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        
        //making use of the fact that the target exists if either cumulative sum is equal to the target or if the target exists between any two cumulative sums.
        //case 2 can be found if the the cumulative sum minus target is equal to a previously found cumulative sum. This means that the target exists between both cumulative sums.
        //we store cumulative sums in a hashmap to keep track cumulative sums up to that point.
        int count = 0;
        unordered_map<int, int> hmap;
        
        //if we get a cumulative sum - target equal to 0, that means cumulative sum is target. Hence, we add 0 to the hashmap. 
        hmap[0] = 1;
        int sum = 0; //cumulative sum
        
        for(int i=0; i<nums.size(); i++){
            sum += nums[i];
            if(hmap.find(sum-k) != hmap.end()){
                count += hmap[sum-k];
            }
            //increment the value of hmap[sum] by 1 for all cumulative sum values.
            hmap[sum] += 1;   
        }
        
        return count;
        
        
    }
};