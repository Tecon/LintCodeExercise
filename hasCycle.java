/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param head: The first node of linked list.
     * @return: True if it has a cycle, or false
     */
    public boolean hasCycle(ListNode head) {
/*
        //Method one
        if(head==null || head.next==null)return false;
        ListNode ln1 = head;
        ListNode ln2 = head.next;
        while(ln1!=ln2){
            if(ln2.next==null || ln2.next.next==null)return false;
            ln1 = ln1.next;
            ln2 = ln2.next.next;
        }
        return true;*/
/*        
        //Method two
        if(head==null)return false;
        ArrayList<Integer> al = new ArrayList<Integer>();
        ListNode ln = head;
        while(ln != null){
        	int temp = ln.hashCode();
        	if(al.contains(temp))return true;
        	else{
        		al.add(temp);
        		ln = ln.next;
        	}
        }
        return false;*/
    }
}
