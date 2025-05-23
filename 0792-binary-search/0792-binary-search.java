class Solution {
    public int search(int[] nums, int target) {
        for(int start=0,end=nums.length-1 ; start<=end ;  ){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return -1;        
    }
}