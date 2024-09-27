// Time Complexity : O(n)
// Space Complexity : O(1)
// Any problem you faced while coding this :
// Your code here along with comments explaining your approach
//1. Create hashmap with initial sum count as 1.
//2. Maintain running sum and check desired sum.
//3. If the running sum already exists update its count by 1.
//3. When desired sum is found increment the current subarray count.

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        //edge
        if(nums.size()==0){
            return 0;
        }
                    //sum, times the sum is encountered
        unordered_map<int,int> my_map;
        my_map[0] =1;
        int count= 0;
        int size = nums.size();
        int running_sum=0;
        
        for(int i=0;i<size; i++){
            running_sum = running_sum + nums[i];
            int desired_sum = running_sum-k;
            if(my_map.find(desired_sum) != my_map.end()){
                count = count + my_map[desired_sum] ;
            }
            my_map[running_sum]++;
        }
        
        return count;
    }
};
