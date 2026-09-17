/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // if (n==1) return 1;
        int start=1;int end=n;
        int i;
        for (i=start;start<=end;){
            i=start+((end-start)/2);
            if(isBadVersion(i)){
                end=i-1;
            }
            else{
                start=i+1;
            }
            
        }
       return start; 
    }
}