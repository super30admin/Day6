// O(1) time // O(n)

class Solution{

public static int countSubarraysWithSumK(int[] a, int K) {
  int n = a.length;
  HashMap < Integer, Integer > hash = new HashMap < > ();
  int count = 0, sum = 0;
  for (int i = 0; i < n; i++) {
    sum += a[i];
    if (sum == K) {
      count++;
    }
    if (hash.get(sum - K) != null) {
      count += hash.get(sum - K);
    }
    if (hash.get(sum) != null) {
      hash.put(sum, hash.get(sum) + 1);
    } else {
      hash.put(sum, 1);
    }
  }
  return count;
}

}
