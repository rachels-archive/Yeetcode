// Problem 876
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        
        ArrayList<ListNode> nodes = new ArrayList<ListNode>();
        
        int length = 0;
        
        // populate ArrayList with each node and increment length
        while (head != null) {
            nodes.add(head);
            head = head.next;
            length += 1;
        }
        
        return nodes.get(length/2);
    }
}
