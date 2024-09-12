class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        //Initialize a hashmap which conatins the running sum and the count of that running           sum
        //This is an O(n) solution with an O(n) space
        unordered_map<int,int>m;
        if(nums.size()==0) return 0;
        m.insert({0,1}); //This is the rsum=0 and its count which is 1
        int rsum=0,c=0;
        for(int i=0;i<nums.size();i++)
        {
            rsum += nums[i];
            if(m.count(rsum-k))
                c+=m.find(rsum-k)->second;
            if(!m.count(rsum))
                m.insert({rsum,1});
            else
                m.insert({rsum,(m.find(rsum)->second)++});
        }
        return c;
    }
};
