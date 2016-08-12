package 从尾到头打印链表;
/**
*    
*
*/
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode node =listNode;
        while(node.next!=null) {
        	list.add(node.val);
        	node = node.next;
        }
        Collections.reverse(list);//将List反转
        return list;
    }
    public class ListNode {
    	int val;
    	ListNode next = null;
    	ListNode(int val) {
    		this.val = val;
    	}
    }
}