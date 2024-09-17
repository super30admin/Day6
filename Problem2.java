//time - O(N)
//space - O(N)
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hashTable = new HashMap<>();
        hashTable.put(0,-1);
        int sum = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++) {
            sum = sum + (nums[i]==0 ? -1 : 1);
            if(hashTable.containsKey(sum)) {
                max = Math.max(max, i - hashTable.get(sum));
            } else {
                hashTable.put(sum,i);
            }
        }
        return max;
        
    }
}