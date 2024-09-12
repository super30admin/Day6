// Time Complexity :o(n)
// Space Complexity :o(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :
//No

// Your code here along with comments explaining your approach
public int subarraySum(int[] nums, int k) {
    //         //if(nums.length==0) return 0;
             //Start with intial sum and check if it exists in a hashmap and count total subarrays formed
             int count=0,sum=0;
             HashMap<Integer,Integer> hs = new HashMap<>();
             hs.put(0,1);
             for(int i=0; i< nums.length; i++){
                 //iterate through intial to sum to find 
                sum +=nums[i];
                 if(hs.containsKey(sum-k)){
                     count+= hs.get(sum-k);
                }
                 hs.put(sum,hs.getOrDefault(sum,0)+1);
                
            }
            
           return count; 
        }
    }
    