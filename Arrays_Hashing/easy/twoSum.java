class twoSum {
    public int[] twoSum(int[] nums, int target) {
        
        int[] arr = new int[2];
        
        int k = 1;
        
        for(int i = 0; i < nums.length; i++){
            if(i != nums.length - 1){
                   for(int j = k; j < nums.length; j++){
                int temp = nums[i] + nums[j];
                if(temp == target){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
            }
         
            k++;
        }
        return arr;
    }
}