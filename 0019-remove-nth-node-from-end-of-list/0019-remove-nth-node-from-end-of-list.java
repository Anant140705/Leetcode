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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode temp = head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        if(n==length){
            return head.next;
        }
        int nodenumber = length - n;
        temp = head;
        for(int i=1;i<=nodenumber;i++){
            if (length==0){
                return null;
            } else if(i==nodenumber){
                temp.next = temp.next.next;
                // temp2.next.next.prev = temp2;
            }
            temp = temp.next;
        }
        return head;
    }
}