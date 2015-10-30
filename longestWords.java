class Solution {
    /**
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    ArrayList<String> longestWords(String[] dictionary) {
        int[] a = new int[dictionary.length];
        int ai=1;
        ArrayList<String> as = new ArrayList<String>();
        int max = 0;
        for(int i=0;i<dictionary.length;i++){
        	if(dictionary[i].length()>max){
        		max = dictionary[i].length();
        		Arrays.fill(a, -1);
        		a[0]=i;
        		ai=1;
        	}
        	else if(dictionary[i].length()==max){
        		a[ai]=i;
        		ai++;
        	}
        }
        
        for(int j:a)
        	if(j>-1)
        		as.add(dictionary[j]);
        return as;
    }
}