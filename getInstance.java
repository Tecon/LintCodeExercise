class Solution {
    /**
     * @return: The same instance of this class every time
     */
    //EagerSingleton
    // private static Solution s = new Solution();
    // private Solution(){
        
    // }
    // public static Solution getInstance() {
    //     return s;
    // }
    //DCL LazySingleton
    private volatile static Solution s;
    private Solution(){}
    public static Solution getInstance(){
        synchronized(Solution.class){
            if(s==null)
                s = new Solution();
        }
        return s;
    }
};
