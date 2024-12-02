// tc O(n)
// sc O(n)


class Solution {
    public int subarraySum(int[] nums, int target) {
        
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int sum = 0;
        int count = 0;
        hashmap.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(hashmap.containsKey(sum - target))
                count = count + hashmap.get(sum - target);
            hashmap.put(sum, hashmap.getOrDefault(sum,0)+1);
            
        }
        return count;
    }
}


// naive solution

// int count = 0;
//         for(int i = 0; i<nums.length;i++){
//             for(int j=i+1; j<=nums.length;j++){
//                 int sum = 0;
//                 for(int k = i; k<j;k++){
//                     sum=sum+nums[k];
//                 }
//                 if(sum==target)
//                     count++;
//             }
//         }
//         return count;