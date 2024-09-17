// Sub Array Sum equals k

// Time-Complexity- O(n) 
// Space Complexity-O(n)-keeping track of the cummulative sums with its occurences count
// passed test cases on leetcode-yes
// faced problem-Initially tried with hashSet but later required to have hashmap to keep track of the count of the occurrences of cummulative sum-k


class Solution {
    public int subarraySum(int[] nums, int k) {
       
        //map to keep track of the cummulative sums occurence
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        hm.put(0,1);
        
        int cummSum=0;
        int resultCount=0;
        
        for(int num:nums){
            cummSum+=num;
            
            if(hm.containsKey(cummSum-k))
                resultCount+=hm.get(cummSum-k);
            
            //adding the current cumulative sum to the hashmap if not exists one
            if(!hm.containsKey(cummSum))
                hm.put(cummSum,0);
            
            //incrementing the count of the current cumulative sum by 1
            hm.put(cummSum,hm.get(cummSum)+1);
            
        }
        
        return resultCount;
        
        // tried with hashSet but later required to have hashmap to keep track of the count of the occurrences of cummulative sum -k
        
//         Set<Integer> set=new HashSet<Integer>();
        
//         int count=0;
//         int cummSum=0;
        
//         set.add(0);
        
//         for(int num:nums){
//             cummSum+=num;
            
//             int result=cummSum-k;
            
//             if(set.contains(result)) {
//                 count++;
//             }
//             set.add(cummSum);
//         }
//         return count;
        
    }
}