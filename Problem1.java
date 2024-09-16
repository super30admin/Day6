import java.util.*;

class Problem1 {

  /*
  Prob1 : subarray-sum-equals-k

  Time : O(n)
  Space : O(n)
  n being max size of the array
  Leetcode : Yes
  Problems faced : I could come up with the HashMap as data structure. But couldn't apply it (didn't know runing sum technique).

  */

  public static void main(String[] args){

      int[] arr = {3, 4, 1, -7, 2, 7, 0, 11, -8, -6, 9, -2, -6};
      System.out.println(subArrSum(arr,3));
  }
  private static int subArrSum(int[] arr, int k){
    if(arr == null || arr.length == 0) return 0;
    HashMap<Integer,Integer> map = new HashMap<>();
    map.put(0,1);

    int rSum = 0;
    int count = 0;
    for(int i =0; i < arr.length ; i++){

      rSum += arr[i];
      if(map.containsKey(rSum - k)){
        count += map.get(rSum - k);
      }

      map.put(rSum, map.getOrDefault(rSum, 0) + 1);

    }
    return count;
  }
}
