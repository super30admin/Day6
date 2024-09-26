
// this is subarray sum equals problem solved in c++
// here i am initially taking an edge case where 0->1 anf then traversing through the vector calculating the running sum , at the same time 
// taking the compliment i.e runningsum - reqsum  and then checking whether that running sum is present in the map or not if present then add the required value at corresponding
// compliment key to the count variable. then we check  whether runningsum is present in map or not if it is than we add 1 to the value of that key.
// if runningsum not present we make a new pair corrseponding to running sum and assign it a value of  and insert it in the map. then finally return count.

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int count=0;
        int runningsum=0;

        unordered_map<int,int> m;
        m[0]=1;
        for(int i=0;i<nums.size();i++)
        {
            runningsum+=nums[i];
            int compliment=runningsum-k;
            if(m.count(compliment)>0)
            {
                count+=m[compliment];
            }

           if(m.count(runningsum)>0)
           {
               m[runningsum]+=1;
           }
            else
            {
                pair<int,int> newpair (runningsum,1);
                m.insert(newpair);
            }

        }

        return count;
        }


};
