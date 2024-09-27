class Solution {
    public int subarraySum(int[] a, int k) {
        if(a == null || a.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int i, count, n, runS;
        runS = 0;
        count = 0;
        n = a.length;
        for(i = 0; i < n; i++) {
            runS += a[i];
            if(map.containsKey(runS - k)) {
                count += map.get(runS - k);
            }
            if(!map.containsKey(runS)) {
                map.put(runS, 1);
            } else {
                map.put(runS, map.get(runS) + 1);
            }
        }
        return count;
    }
}