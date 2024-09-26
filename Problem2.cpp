//Space Complexity: O(n)
//Time Complexity: O(n), where n is the length of the array.
//Executed successfully on leetcode.

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        unordered_map<int,int> map;
        int rs = 0;
        map.emplace(0,-1);
        int max = 0;
        for(int i = 0; i<nums.size(); i++){
           if(nums.at(i)==1){
                rs+=1;
            }
            else{
                rs+=-1;
            }
            if(!map.count(rs)){
                map.emplace(rs,i);
            }
            else{
                int ind = map.at(rs);
                int temp = i - ind;
                if(temp>max){
                    max = temp;
                }
            }
        }
        return max;
    }
};