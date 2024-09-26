// Time Complexity :O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :


// Below is the appproach using the hashMap

//THis is the brute force solution using the nested loop.
class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum=nums[i];
            if(sum==k){
                count=count+1;
            }
            //System.out.println(nums[i]);
            for(int j=i+1;j<nums.length;j++){
                sum=sum+nums[j];
                //System.out.println(sum);
                if(sum==k){
                    count=count+1;
                }
            }
        }
        return count;
    }
}

// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :


//Below is the solution using the running sum pattern
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length==1 && nums[0]!=k)return 0;
        int sum=0;
        int count=0;
        HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
        hash.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
           // System.out.println(sum);
            //System.out.println("diff="+(sum-k));
            if(hash.containsKey(sum-k)){
                 //System.out.println("hi");
                count=count+hash.get(sum-k);
            }
            if(hash.containsKey(sum)){
                hash.put(sum,hash.get(sum)+1);
            }else{
                hash.put(sum,1);
            }

            
        }
       // System.out.println(hash);
        return count;
    }
}