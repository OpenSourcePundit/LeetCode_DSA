class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxvalue = 0 ;
        int tempvalue = 0 ;
        if(nums[0]==1){tempvalue=1;maxvalue=1;}
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i]==1){
                if(nums[i-1]==1){
                    tempvalue++;
                    if(maxvalue<tempvalue){
                        maxvalue=tempvalue;
                    }
                }else{
                    tempvalue=1;
                     if(maxvalue<tempvalue){
                        maxvalue=tempvalue;
                    }
                }
            }else{
               tempvalue=0;
            }


        }
        return maxvalue;
        
    }
}