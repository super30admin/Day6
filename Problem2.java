package PACKAGE_NAME;

public class Problem2 {
    public int findMaxLength(int[] nums) {
        int balance =0;
        int maxLenth=0;
        Map<Integer,Integer> freq = new HashMap<>();
        freq.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                balance--;
            }else{
                balance++;
            }
            if(!freq.containsKey(balance)){
                freq.put(balance,i);

            }else{
                maxLenth = Math.max(maxLenth,i-freq.get(balance));
            }

        }return maxLenth;


    }
}
