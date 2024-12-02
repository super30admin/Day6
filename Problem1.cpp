// Subarray sum equals k


// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes, it successfully ran on leetcode.
// Any problem you faced while coding this : Minor, did have to check logic again.


// Your code here along with comments explaining your approach

#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        if(nums.size() == 0) return 0;   // if array empty, return 0
        int count = 0; // initialze count and sum
        int sums = 0;
       unordered_map<int, int> m;  
        m[0] = 1; // We put a count of 0, so that if our sum-k is 0 we get the appropriate count
        for(int i = 0; i<nums.size(); i++)
        {
            sums +=nums[i];        // get the sum of elements
            if(m.find(sums-k)!= m.end())
            {
                count+= m[sums-k];        // increase count
            }
            m[sums] = m[sums] + 1;    // if sums exist in array, increase value or put it into array
            
        }
        return count;
        
    }
};
// int main(){
    
//     return 0;
// }