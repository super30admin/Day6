class Solution {
public:
    int findMaxLength(vector<int>& nums) {
     
        unordered_map<int, int> map;
        
        map.insert(make_pair(0, -1));
        int rsum=0, maxi=0;
           
        for(int i =0;i<nums.size();i++) {
            
            if(nums[i] == 0){
                rsum--;
                
            }else {
                rsum++;
            }
            
            if(map.find(rsum) != map.end()){
                maxi = max(maxi, i - map[rsum]);
            }
            else {
                map.insert(make_pair(rsum, i));
            }
       
        }
        
        
        return maxi;
    }
};
