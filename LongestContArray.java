// Time Complexity : 0(n)
// Space Complexity : 0(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach


class LongestContArray {
    public int findMaxLength(int[] nums) {

        int runningSum=0;
        int n=nums.length;
        int ans=0;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        hmap.put(0,-1);//dummy arr to catch at index0
        for(int i=0;i<n;i++){

            if(nums[i]==0){
                runningSum--;

            }else{

                 runningSum++;

            }
         if(hmap.containsKey(runningSum)){
            ans=Math.max(ans,i-hmap.get(runningSum));

         }else{

            hmap.put(runningSum,i);
         }

        }
          return ans;
  
    }
}
