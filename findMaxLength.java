class Solution{
    public int findMaxLength(int[] nums){
        if(nums == 0 || nums.length == 0) return 0; //base case where if the nums array dosent have any elements, we return 0;
        HashMap<Integer, Integer> map = new HashMap<>(); // we create a new hashMap here.
        map.put(0 , -1); // we add a value 0 at index -1.
        int count = 0, max = 0; // we take 2 variables count and max and we initialize it to 0;
        for(int i = 0; i < nums.length(); i++){ // we go through each and every elements in the nums array
            if(nums[i] == 0){ // if we see a 0 while we are traversing through the list
                count--;// we reduce the count by 1
            }
            else{ //since we either see 0 or 1, if we dont see a 0
                count ++; // we increment the count by 1.
            }
            if(map.containsKey(count)){ //we go through the map and we check if the map contains the count.
                max = Math.max(max, i-map.get(count)); // if the map contains the count we got, we compare the old max and value at the current index, i-map.get(count) where i is the value of the current index and map.get(count) gives the value of the count present at the particular index. so what this step does is index - count present in that index;
             }
            else{ // if map dosent contain the count you encounter
                map.put(count, i); // if put the new count in the map and the index at which you go to see the value.
            }
        }
        return max;
    }
}
//TC and SC - O(n)