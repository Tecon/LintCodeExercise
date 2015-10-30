public class Solution {
    /**
     * @param s A string
     * @return whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
    	Stack<Character> skc = new Stack<Character>();
    	if((s.length()&1) == 1)return false;
    	for(int i=0;i<s.length();i++){
    		char c = s.charAt(i);
    		if(c=='('?true:c=='{'?true:c=='['?true:false)
    			skc.push(c);
    		else{
    			if(skc.size()==0)return false;
    			else{
	    			char ch = skc.pop();
	    			if(ch=='('?c==')':ch=='{'?c=='}':ch=='['?c==']':false)
	    				continue;
	    			else
	    				return false;
    			}
    		}
    	}
    	return skc.size()==0?true:false;
    }
}
