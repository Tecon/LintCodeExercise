public class Solution {
    /**
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public int replaceBlank(char[] string, int length) {
        if(length == 0)return 0;
		for(int i=0;i<this.getReallyLength(string);i++){
			if(string[i] == ' '){
				string=removeToEnd(string, 2, i+1, this.getReallyLength(string));
				string[i]='%';
				string[i+1]='2';
				string[i+2]='0';
				i=i+2;
			}
		}
		return this.getReallyLength(string);
    }
    
    
	/**
	 * 将数组从start开始向后移动step长度，例如：1，2，3(step=2,start=2)->1,2,*,*,3
	 * @param str 字符串数组
	 * @param step	移动的步进
	 * @param start	从哪里开始
	 * @param length	数组实际大小
	 * @return
	 */
	private char[] removeToEnd(char[] str,int step,int start,int length){
		for(int i=length-1;i>=start;i--){
			str[i+step]=str[i];
		}
		return str;
	}
	/**
	 * 返回char型数组的实际长度
	 * @param str
	 * @return
	 */
	public int getReallyLength(char[] str){
		for(int i=str.length-1;i>=0;i--){
			if(str[i] != '\u0000'){
				return i+1;
			}
		}
		return 0;
	}  
}