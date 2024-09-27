//Time Complexity - O(N)
//Space Complexity - O(N)
class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        unordered_map<int,int>m;
        int cnt=0,max=0;
        m[0]=-1;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==0){
                cnt--;
            }
            else{
                cnt++;
            }
            if(m.find(cnt)==m.end()){
                m[cnt]=i;
            }
            else if(m.find(cnt)!=m.end())
            {
                if(i-m[cnt]>max){
                    max=i-m[cnt];
                }    
            }
        }
        return max;
    }
};