class ContiguousArray {

    public int findMaxLength(int[] nums) {

        public int subarraySum(int[] nums, int k) {

            //O(n) space and time
            HashMap<Integer, Integer> map = new HashMap<>();
            int runningSum = 0;
            int count = 0;
            map.put(0, 1);

            for (int i=0; i<nums.length; i++) {

                runningSum += nums[i];

                if(map.containsKey(runningSum - k)) {
                    count += map.get(runningSum - k);
                }
                map.put(runningSum, map.getOrDefault(runningSum, 0) + 1);

            }

            return count;

        }

    }
}