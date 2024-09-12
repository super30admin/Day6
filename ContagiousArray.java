class Solution {
//SC: O(n) as all new elements can come here;
//TC: O(n) as will have to traverse through the array elements atleast once;
    
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        int sum=0;
        int max=0;
        int num=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum=sum-1;       
            }else{
                sum=sum+1;
            }if(!map.containsKey(sum)){
                map.put(sum,i);
            }else if(map.containsKey(sum)){
                num=i-map.get(sum);
                if(num>max){
                    max=num;
                }
            }
        }
        return max;
    }
}
