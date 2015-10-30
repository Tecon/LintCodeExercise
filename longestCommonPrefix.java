public class Solution {
    /**
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
    	if(strs.length==0)return "";
    	else if(strs.length==1)return strs[0];    	
    	int a = 0;
    	//init a
    	a = this.getMaxCommon(strs[0], strs[1]);
    	for(int i=1;i<strs.length-1;i++){
    		int temp = this.getMaxCommon(strs[i], strs[i+1]);
    		if(a>temp){
    			a = temp;
    		}
    	}
    	return strs[0].substring(0, a);
    }
    
    private int getMaxCommon(String s1,String s2){
        int i=0;
        int min = Math.min(s1.length(), s2.length());
    	for(;i<min;i++){
    		if(s1.charAt(i)!=s2.charAt(i))
    			return i;
    	}
		return (i==1)?1:(i==min)?min:0;
    }
}
