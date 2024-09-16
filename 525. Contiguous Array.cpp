//TC-O{N}
//SC-O(N)
class Solution {
public:
    int findMaxLength(vector<int>& nums) {
      int n=nums.size();
      int running_sum=0;
        int max_val=0;
      unordered_map<int,int> h;
        h[0]=-1;//0,1
         for(int i=0;i<nums.size();i++){
             if(nums[i]==0)running_sum--;
             else if(nums[i]==1)running_sum++;
             
             if(h.find(running_sum)==h.end()){
                 h[running_sum]=i;
             }
             else{
                 max_val=max(max_val,i-h[running_sum]);
             }
         }   
        return max_val;
       
    }
};