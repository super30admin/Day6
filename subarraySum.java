class Solution{
    public int subarraySum(int[] nums || int k){
        if(nums == 0 || nums.length == 0) return 0; //if the array is empty, we return 0. this is the base case.
        HashMap<Integer, Integer> map = new HashMap<>(); // we create a hashMap with name map and pass integer as the inputs.
        int rSum = 0; count = 0; // we create 2 variables rSum and count and initialize it to 0;
        map.put(0,-1); // this is the base case, where we start iterating through the array from ths point which is 0 and -1.
        for(int i = 0; i < nums.length(); i++){ // we go through each and every element in the array
            rSum = rSum + nums[i]; // we add each and every element continuously and maintain a rolling sum for the array. we need to maintain the rolling sum by adding the elements we encounter  in the array to the previous rsum. Initially the rsum is 0 and as we go through the array, we keep adding the elements to the rSum.
            if(map.containsKey(rSum-k)){ // we check if the hashmap contains the value of rSum-k
                count = count + map.get(rSum - k) // if it contains, we increment the counter by adding the number of times we hahve already enocuntered the rSum - k value.
            }
            map.put(rSum, map.getOrDefault(rSum, 0) + 1) // at every step we put the current running sum and the number of occurances of the particular current running sum. if the rSum - k is occuring for the first time, we take the default value as 0 and if we have already seen the element before, we take the number of occurances of the element + 1.
        }
        return count;
    }
}

// TC and SC - O(n)