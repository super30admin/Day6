//Time Complexity:  O(n)
//Space Complexity: O(n)


class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map1 = new HashMap<>();

        int maximumlength = 0;
        int count = 0;

        map1.put(0,-1);

        for(int i = 0; i< nums.length;  i++){

            count = count + (nums[i] == 1 ? 1 : -1);

            if(map1.containsKey(count)) {

                maximumlength = Math.max(maximumlength, i - map1.get(count) );

            }
            else {
                map1.put(count,i);
            }


        }

        return maximumlength;

    }
}