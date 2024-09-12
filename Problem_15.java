// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : not tried on Leetcode. It ran on my IDE with correct console output.
// Any problem you faced while coding this : logic. Can't build the logic by myself. took help from geeksfromgeeks.

import java.util.HashMap;

class subArray{

    static int findSubarraySum(int arr[], int n, int sum)
    {
        HashMap <Integer, Integer> prevSum = new HashMap<>();

        int res = 0;

        int currsum = 0;

        for (int i = 0; i < n; i++) {

            currsum += arr[i];

            if (currsum == sum)
                res++;

            if (prevSum.containsKey(currsum - sum))
                res += prevSum.get(currsum - sum);

            Integer count = prevSum.get(currsum);
            if (count == null)
                prevSum.put(currsum, 1);
            else
                prevSum.put(currsum, count+1);
        }

        return res;
    }

    public static void main(String []args){

        int arr[] = {1,1,1};
        int sum = 2;
        int n = arr.length;
        System.out.println(findSubarraySum(arr, n, sum));
    }
}
