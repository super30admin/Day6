//TC : O(n)
//SC : O(1)
//runs in leetcode
class ContiguousArraySum {
    public static int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //store prefixSum, minIndex . minIndex because we need max size.
        //replace 0 with -1 with adding. so k=0
        //we need to add prefix 0 in hashmap so that it can search and find for first occurance
        map.put(0,-1); //intialize

        int maxLength= 0;
        int prefixSum = 0;
        for(int i=0; i<nums.length;i++){
            prefixSum +=  nums[i] ==0 ? -1 : 1;

            int index = map.getOrDefault(prefixSum, 0);
            if(index == 0)
                map.put(prefixSum, i);
            else{  //prefixSum has entry
                int len = i - index;
                maxLength = Math.max(maxLength, len); // we will get multiple lengths but need max
            }

        }

        return maxLength;
    }

    public static final void main(String [] args){
        // 10100110001
        int [] nums = {0,1,0};
        System.out.println("output:: " + findMaxLength(nums));
        int [] nums1 = {1,0,1,0,0,1,1,0,0,0,1};
        System.out.println("output:: " + findMaxLength(nums1));

    }
}



