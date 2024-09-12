class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        
      int count = 0, sum = 0;
        
        unordered_map<int,int> map;
        map.insert(make_pair(0,1));
        
        for(int i =0;i<nums.size();i++){
            sum += nums[i];
            if(map.find(sum-k)!=map.end()){
                count+= map[sum-k];
            }
            
            int value=0;
            if(map.find(sum)!=map.end()) {
                map[sum]++;
            }
            map.insert(make_pair(sum,value + 1));
            
        }
        for(auto it: map){
            cout<<it.first<< " "<< it.second<< " "<<endl;        
        }
        
        return count;                       
                           
        
        
    }
};
