// Time complexity-O(n)
// space complexity O(n);
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

// iterate over ech element in the array
// if element is 1 increment count by 1 and decrement by one if its a zero
// if running sum has occurred before just get the index where it occured before and compare with the current max_count


#include <iostream>
#include <vector>
#include<unordered_map>
using namespace std;


class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        // null check
        if(nums.size()==0){return 0;}
        unordered_map<int,int> hash_map;
        int r_sum=0;
        hash_map[0]=-1;
        int count=0;
        
        for(int i=0;i< nums.size();i++){
            if(nums[i] ==1){
                r_sum+=1;
            }else{
                r_sum-=1;
            }
            if(hash_map.find(r_sum) == hash_map.end()){
                hash_map[r_sum]= i;
              
            }
            int curr_count = i - hash_map[r_sum];
            count = max(count,curr_count);
        }
        
        
        
        return count;
    }
};