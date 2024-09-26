//Space Complexity: O(n)
//Time Complexity: O(n), n is length of the array.
//Executed successfully on leetcode.

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int,int> map;
        int count = 0; int rs = 0;
        map.emplace(0,1);
        for(int i =0; i<nums.size(); i++){
            rs += nums.at(i);
            int comp = rs - k;
            if(map.count(comp)){
               count = map.at(comp)+ count;
            }
            if(map.count(rs)==0){
                map.emplace(rs,1);
            }
            else{
                map[rs]+=1;
            }
        }
        return count;
    }
};