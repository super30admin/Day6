class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        //Using brute force it will be O(n^2). This method will ne O(n).
        //Take a hashmap with the array indices and their running rums.
        if(nums.size()==0)
            return 0;
        int rsum=0,max=0;
        unordered_map<int,int>m;
        m.insert({0,-1});
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]==0)
                rsum--;
            else
                rsum++;
            if(m.count(rsum))
            {
                int k=i-m.find(rsum)->second;
                if(k>max)
                    max=k; 
            }
                //m[rsum].push_back(i);
            else
            {
                m.insert({rsum,i});                              
            }
        }
        return max;
    }
};