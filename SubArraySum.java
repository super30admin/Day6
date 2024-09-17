// TC : O(n)
// SC : O(1)
// runs in leetcode

//add prefix sum in hashmp along with occurance count
//determine excess of current prefix sum and see if excess prefix sum is present in hashmap.
//presence of excess prefix sum means that we have sub array sum we are looking
class SubArraySum {
    public static int subarraySum(int[] nums, int k) {
        int count =0;
        int prefixSum=0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0,1);

        for(int i=0;i< nums.length; i++){
            prefixSum += nums[i];
            int tmp = 0;

            int excess = prefixSum - k;

            int cnt = map.getOrDefault(excess,0);
            count+=cnt;

            tmp = map.getOrDefault(prefixSum , 0) + 1;
            map.put(prefixSum, tmp);

        }
        return count;

    }

    public static final void main(String [] args){
        int [] nums = {1,1,1};
        int k = 2;


        System.out.println(subarraySum(nums,k));
        int [] nums1 = {1,2,3};
        k = 3;
        System.out.println(subarraySum(nums1 ,k));
    }
}
