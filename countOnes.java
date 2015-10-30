public class Solution {
    /**
     * @param num: an integer
     * @return: an integer, the number of ones in num
     */
    public int countOnes(int num) {
        String s = Integer.toBinaryString(num);
        int count = 0;
        for(int i = 0;i < s.length();i++)
        {
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
};