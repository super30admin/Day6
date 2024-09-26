// O(n) space and O(n)time complexity

// in this initially we put in our map 0->-1 as an edge case .now we iterated through the array and we add 1 to the current sum if the element encountered is 1 and we add -1 if element encountered is 0. then we check that the corresponding sum is present in hashmap or not if it does then we find maximum between pevious maximum length and length found currently by subtracting from current index to the value of currentsum else we put the corresponding value of currentsum as the index encountered now. at the last we return the maxlength.
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxlen=0;
        map.put(0,-1);
        int currsum=0;
        for(int i=0;i<nums.length;i++)
        {
            currsum=currsum+(nums[i]==1?1:-1);
            if(map.containsKey(currsum))
            {
                maxlen=Math.max(maxlen,i-map.get(currsum));
            }
            else
                map.put(currsum,i);
        }
        return maxlen;
    }
}
