/*

Thought Process: We need to understand on how to use hashmap to store count and index. For 0 make count-- and for 1 make count++. Then match with the count present in the hashmap and find the max length (current i - map.get(count))

T.C -> O(N)
S.C -> O(N)

*/

class ContiguousArray {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxlen;
    }
}