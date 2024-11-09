import java.util.HashMap;

/*
    Time Complexity : O(n) {going over entire input array}
    Space Complexity : O(n) {we are storing the running sum for the length of the array or less than that if the running sum
                       has already happened}

                       In palindrome example, we had characters as keys in hash map which had a maximum size of 26, so the space
                       complexity will be O(1) in those cases but here in this question in worst case suppose we have a string of
                       1's (1,1,1,1,1,1....) 1 million, in that case the running sum will keep on increasing be 1 million, so in
                       such case the size of hash map keys will be a 1 million so we say space complexity in this case is O(1).

    Did this code successfully run on Leetcode : Yes

    Here we need to find the subarray which will have equal number of 0 and 1, it is a binary array

    Here we are eliminating the nested iterations using Running Sum Pattern, the nested iterations which we get in brute force
    approach making time complexity O(n^3) =>

    find all possible sub arrays {basically combinations}and doing that for every
    element in array that will make O(n^2). Now after this we need to go to each and every sub array to see if it is balanced
    or not, that will take other O(n) so total time complexity is O(n^3), space complexity will be O(1) as we wil not be storing
    the sub arrays
 */

/*
EDGE CASE: to cover the initial occurrence of 1 or 0 to get correct length

eg:               [1, 0, 1, 0]
Running Sum =>  0, 1, 0, 1, 0
Index=>        -1, 0, 1, 2, 3
length = 4

HashMap: 0 : -1 (Running sum of zero has happened at index -1)
         1 :  0

    Zero again at index 1, so length => Index 1 - Index -1 (1-(-1)) = 2
    Once again at index 2, so length => Index 2 - Index 0 = 2
    Zero again at index 3, so length => Index 3 - Index -1 (3-(-1)) = 4

    So length of longest contiguous array = 4
*/

class LongestContiguousSubArray {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>(); //rSum : earliestIndex
        int rSum = 0;
        int length = 0;

        map.put(0, -1); //EDGE CASE
        int startIndex = 0, endIndex = 0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 0)
                rSum --;
            else
                rSum ++;

            if (map.containsKey(rSum))
            {
                if (length < i-map.get(rSum))
                {
                    //If the running sum is present in the map, we update the length
                    length = Math.max(length, i-map.get(rSum));

                    //i-map.get(rSum) => current index - older index(first occurrence)

                    startIndex = map.get(rSum);
                    endIndex = i;
                }
            }
            else {
                map.put(rSum, i); //First occurrence
            }
        }

        System.out.println(startIndex + " " + endIndex);
        return length;
    }
}
