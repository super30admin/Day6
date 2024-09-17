class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,0);
        map.put(1,0);
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
                System.out.println(nums[i]+" this occurs "+map.get(nums[i]));
            }
            /*else {map.put(nums[i],1);
            System.out.println(nums[i]+" this occurs "+map.get(nums[i]));}*/
        }
        int min=Integer.MAX_VALUE;
        int key_1=map.keySet().stream().findFirst().get();
        int m = map.get(key_1);
        System.out.println(m);
        int occurence=m;
         System.out.println(occurence);
        for (Integer key : map.keySet())  
        { 
            // search  for value 
            occurence = map.get(key);

            if(occurence<min) min=occurence; 
        
            System.out.println("Key = " + key + ", Value = " + occurence);
            //if(m!=occurence) return 0;           
        } 

        //if(map.get(nums[1])>map.get(nums[0])) return 2*map.get(nums[0]);
        //else return 2*map.get(nums[1]);

        return 2*min;
    }
}
