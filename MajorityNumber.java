import java.util.HashMap;
import java.util.Map;
public class Solution {
    /**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(ArrayList<Integer> nums) {
    	int length = nums.size();

    	HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
    	for(int i=0;i<length;i++){
    		if(m.containsKey(nums.get(i)))
    		{
    			Integer rep = new Integer(m.get(nums.get(i))+1);
    			Integer numsi = new Integer(nums.get(i));
    			if(rep>length/2) return nums.get(i);
    			//m.replace(numsi, rep);	//Map.replace require jdk1.8 or above
    			m.remove(numsi);
    			m.put(numsi,rep);
    		}
    		else
    		{
    			m.put(nums.get(i), 1);
    		}
    	}
/*     	
		Codes following offer you superior Numbers
		int mapSize = m.size();
    	int max = 0;
    	int key = 0;
    	for(int j=1;j<mapSize;j++){
    		if(m.get(j)>max){
    			max = m.get(j);
    			key = j;
    		}
    	}
    	return key; */
		return 0;//Function required return int,in fact,it will never work;
    }
}