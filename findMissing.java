public class Solution {
    /**    
     * @param nums: an array of integers
     * @return: an integer
     */
    public int findMissing(int[] nums) {
        //O(n)space AND O(n)time
        // BitSet bs = new BitSet();
        // for(int i=0;i<nums.length;i++){
        // 	bs.set(nums[i], true);
        // }
        // int j=0;
        // for(;j<bs.length();j++){
        // 	if(bs.get(j)==false)
        // 		return j;
        // }
        // return j;
        
        //O(n)time
        int max=0,standSum=0,realSum=0;
        for(int i=0;i<nums.length;i++){
            standSum+=i;
            realSum+=nums[i];
            if(nums[i]>max)max=nums[i];
        }
        if(standSum==realSum)
            return max+1;
        else{
            standSum+=max;
            return standSum-realSum;
        }
    }
}
