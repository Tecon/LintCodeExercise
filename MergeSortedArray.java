class Solution {
    /**
     * @param A: sorted integer array A which has m elements, 
     *           but size of A is m+n
     * @param B: sorted integer array B which has n elements
     * @return: void
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
		if(this.getIntLength(A) == 0){
			for(int i=0;i<m+n;i++){
				A[i] = B[i];
			}
			return;
		}
		int i=0,j=0;
        for(;j<n;j++){
            for(;i<this.getIntLength(A);i++){
            	if(B[j]<=A[0]){
            		A=insertInt(A, 0, B[j]);
            		break;
            	}
            	else if(B[j]>=A[this.getIntLength(A)-1]){
            		A=insertInt(A, this.getIntLength(A), B[j]);
            		break;
            	}
            	else if(B[j]>A[i]&&B[j]<=A[i+1]){
            		A=insertInt(A, i+1, B[j]);
            		break;
            	}
            }
        }
    }
    
    /**
     * 将j插入到A[i]位置处
     * @param A
     * @param i
     * @param Bj
     */
    private int[] insertInt(int[] A,int i,int j){
    	for(int m=this.getIntLength(A);m>i;m--){
    		A[m]=A[m-1];
    	}
    	A[i]=j;
    	return A;
    }
    
	/**
	 * 该函数返回整型数组的实际元素数目
	 * @param a
	 * @return
	 */
	private int getIntLength(int[] a){
		for(int i=a.length-1;i>=0;i--){
			if(a[i] != 0){
				return i+1;
			}
		}
		return 0;
	}
}