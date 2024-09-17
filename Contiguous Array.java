// time - o(n)
// space - o(n)

class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int max=0;

        //[0,1]

        for(int i=0 ; i<nums.length ; i++){

           sum += nums[i] == 1 ? 1:-1;

           if(sum == 0) max = Math.max(max,i+1);

           else if(map.containsKey(sum)) max = Math.max(max,i-map.get(sum));

           else if(!map.containsKey(sum)) map.put(sum,i);

        }

        return max;
    }
}
