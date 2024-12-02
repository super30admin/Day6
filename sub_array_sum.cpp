// Time complexity-O(n)
// space complexity O(n);
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

// iterate over ech element in the array
// if the difference between that eelent and k existsing inthe array increment count and also increment the number of times the element occured
// else just just add the running sum and increment its value by 1





#include <iostream>
#include <vector>
#include<unordered_map>
using namespace std;


class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
     
        unordered_map<int,int>hash_map;
        int count=0;
        int r_sum=0;
        hash_map[0]=1;

        for (size_t i = 0; i < nums.size(); i++)
        {
            r_sum+=nums[i];
           
            if (hash_map.find(r_sum-k) != hash_map.end())
            {
                count+=hash_map[r_sum-k];

            }
            hash_map[r_sum]++;

            
        }
        
    return count;
    }
};