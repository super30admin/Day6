//https://leetcode.com/problems/contiguous-array/

//again, ksum, here I treated 0 as -1 and got to max_point where sum remains 0
//T.C = O(n)
//S.C = O(n) 

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
    int temp_sum =0;
    unordered_map<int,int> mp;
    int longest_subs = 0;
    for(int i=0;i<nums.size();i++){
        temp_sum+=(nums[i]==0)?-1:1;
        auto iter= mp.find(temp_sum);
        if(temp_sum==0){
            if(longest_subs<i+1)
                longest_subs= i+1;
        }
        else if(iter!= mp.end()){
             if(longest_subs<i-iter->second)
                longest_subs= i-iter->second;
        }
        else if(iter == mp.end())
            mp.insert(make_pair(temp_sum,i));
    } 
    return longest_subs;
    }
};