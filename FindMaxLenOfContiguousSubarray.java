//Time Complexity: O(n)
// Space Complexity: O(n)
// Time and space complexity are same for boththe approaches.
// Source: leetcode #525
//Find Max Length Of Contiguous Subarray with equal no. of zeros and ones
// The technique we are using in both the approches is running sum (rsum)

class Solution {
    
 /* 
 //Approach using HashMap
 public int findMaxLength(int[] nums) {
        int rsum=0, res=0, len=0;
        if(nums.length==1)
            return 0;
        HashMap<Integer,Integer> sum2idx=new HashMap<>();
        sum2idx.put(rsum,-1);// Initially we start with rsum=0 at index=-1, so that we do miss the array [0,1] or [1,0]
        
        for(int i=0;i<nums.length;i++)
        {
            rsum+=(nums[i]==0? -1: 1);
            if(sum2idx.containsKey(rsum))
            {
                len=i - sum2idx.get(rsum);
                if(len>res)
                {
                    res=len;
                }
            }
            else
                sum2idx.put(rsum,i);
        }
        
        return res;
    }
    */
    
    // Approach using an array instead of hashmap
    // Not rsum can range from -arrayLength to + arrayLength. 
    //rsum= -arrLength when all the elements are zeros
    //rsum=  arrLength when all the elements are 1's
	
     public int findMaxLength(int[] nums) {
        int rsum=0, res=0, len=0,n=nums.length;
        if(n==1)
            return 0;
       
         int[] sum2idx=new int[2*n+1];
         Arrays.fill(sum2idx,-2);         //A valid length is reached when either count == 0 or a same count appears. Entries for counts other than zero store the actual index when the count happens so we can't initialize the temp array with 0. Count of zero value can't contain an index either, the contiguous array is valid regardless of count of zero being appearing previously so -1 is chosen for it. So it leaves us -2 to initialize the temp array with and it also makes the first condition in the for loop work perfectly for both valid cases.
         
         sum2idx[n]=-1; // Initially we start with rsum=0 at index=-1, so that we do miss the array [0,1] or [1,0]
        
        for(int i=0;i<nums.length;i++)
        {
            rsum+=(nums[i]==0? -1: 1);
            if(sum2idx[n+rsum]>=-1)
            {
                len=i - sum2idx[n+rsum];
                if(len>res)
                {
                    res=len;
                }
            }
            else
                sum2idx[n+rsum]=i;
        }
        
        return res;
    }
}