// Time Complexity: O(n)
// Space Complexity: O(1)

public class CountSubArray {
    static int val = 0;
    public static int subarraySum(int[] nums, int k) {
        printSubArray(nums, 0, k);
        return val;
    }
    public static void printSubArray(int [] input, int currIndex, int k){
        int sum = 0;
        if(currIndex == input.length)
            return ;
        //adding all the subarray from currIndex to end
        for (int i = currIndex; i <input.length ; i++) {
            sum += input[i];
            if(sum == k)
                val++;
        }
        //using recursion we increment index by 1 until it is length -1; 
        printSubArray(input, currIndex+1, k);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,4,23,4,5,3,2,1,2,3,4,5,45};
        System.out.println(subarraySum(nums, 10));
    }
}