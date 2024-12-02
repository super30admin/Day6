public class contigousArray {
    public static int findMaxLength(int[] nums) {
        //First we will iterate over the whole array and replace every 0 present in the array with -1
        for(int i =0;i<nums.length;i++){
            if (nums[i] == 0){
                nums[i] =-1;
            }
        }
        //Second we will create a HashMap to store sum to index mapping in the map and will initialize two variables named sum and max
        HashMap<Integer,Integer> hmap = new HashMap<>();
        //sum to index mapping
        int sum =0;
        int max =0;
        hmap.put(0,-1);
        //iterating over the array and adding  them to calculate the sum
        for(int i =0;i<nums.length;i++){
            sum += nums[i];

            if(hmap.containsKey(sum)){
                max = Math.max(max , i - hmap.get(sum));
            }
            else{
                hmap.put(sum,i);
            }

        }
        return max ;
    }
    public static void main (String[] args) {
        int[] nums = {0,1,0,1};
        System.out.println(findMaxLength(nums));
    }
}
