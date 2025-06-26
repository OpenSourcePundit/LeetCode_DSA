class Solution {
    public void moveZeroes(int[] nums) {
        int i , j ;
        for(i=0,j=0 ;j<nums.length ; j++){
            if(nums[j]==0){

            }else{
                nums[i]=nums[j];
                i++;
            }
        }
        for( ; i<nums.length ; i++){
            nums[i]=0;
        }
        
    }
}