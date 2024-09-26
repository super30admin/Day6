public class Solution {
    public int subarraySum(int[] nums, int k) {
        int c = 0, s = 0;
        HashMap < Integer, Integer > m = new HashMap < > ();
        m.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
            if (m.containsKey(s - k))
                c += m.get(s - k);
            m.put(s, m.getOrDefault(s, 0) + 1);
        }
        return c;
    }
}
//tc=O(n)
//sc=O(n)
