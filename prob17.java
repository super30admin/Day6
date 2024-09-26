

prob:17 subarray sum equal K

class Solution {
    public int subarraySum(int[] nums, int k) {
        
HashMap<Integer, Integer> hashMap = new HashMap<>();
int count=0;
int currSum=0;

hashMap.put(0,1);
        
        for(int x : nums){
currSum +=x;
int compliment= currSum -k;
if(hashMap.containsKey(compliment))
count+=hashMap.get(compliment);

hashMap.put(currSum,hashMap.getOrDefault(currSum,0) +1);
}

    return count;

}
}


//Tc : O(n)
//sc:O(n)