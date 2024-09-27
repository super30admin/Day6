// TC: O(n)
// SC: O(1)
class Solution {
    public int findMaxLength(int[] a) {
        if(a == null || a.length == 0) {
            return 0;
        }
        int i, n, count, runS, c;
        runS = 0;
        count = 0;
        n = a.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(i = 0; i < n; i++) {
            if(a[i] == 0) {
                runS--;
            } else {
                runS++;
            }
            if(map.containsKey(runS)) {
                c = i - map.get(runS);
                if(c > count) {
                    count = c;
                }
            } else {
                map.put(runS, i);
            }
        }
        return count;
    }
}