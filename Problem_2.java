// Time Complexity :O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :no
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

//Below is the brute force solution for which I got the TLE
class Solution {
    public int findMaxLength(int[] nums) {
        int one=0;
        int zero=0;
        int maxLength=0;
        for(int i=0;i<nums.length;i++){
            one=0;
            zero=0;
            //System.out.println("i= "+i);
            for(int j=i;j<nums.length;j++){
                if(nums[j]==1){
                    one=one+1;
                }else if(nums[j]==0){
                    zero=zero+1;
                }
                if(one==zero){
                    if((j-i+1)>maxLength){
                        maxLength=(j-i+1);
                    }
                }
            }
            
        }
        return maxLength;
        //[0,1,0,1,1,1,1,0,0,1,0]
        
    }
}

// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :

//below is the solution using the running sum pattern and the hashmap.
class Solution {
    public int findMaxLength(int[] nums) {
        int maxLength=0;
        int sum=0;
        HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
        hash.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum=sum-1;
            }else if(nums[i]==1){
                sum=sum+1;
            }
            if(hash.containsKey(sum)){
                //System.out.println("diff ="+(i-hash.get(sum)));
                if((i-hash.get(sum))>maxLength){
                    maxLength=i-hash.get(sum);
                }
            }else{
                hash.put(sum,i);
            }
            
        }
       
        return maxLength;
        //[0,1,0,1,1,1,1,0,0,1,0]
        
    }
}

