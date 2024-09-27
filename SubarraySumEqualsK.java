// Brute force approach
// TC: O(n^2)
class Solution {
    public int subarraySum(int[] a, int k) {
        int i, j, n, sum, count = 0;
        n = a.length;
        if(a == null || n == 0) return 0;
        i = 0;
        while(i < n) {
            sum = 0;
            j = i;
            while(j < n) {
                sum += a[j];
                if(sum == k) {
                    count++;
                }
                j++;
            }
            i++;
        }
        return count;
    }
}