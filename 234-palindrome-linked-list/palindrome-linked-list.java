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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();

        ListNode temp = head;
        while (temp != null) {
            st.push(temp.val);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            if (temp.val != st.pop())
                return false;
            temp = temp.next;
        }

        return true;
    }
}




// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         ListNode slow=head;
//         ListNode fast=head;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;

//             if (slow == fast)
//                 return true;
//         }
//         return false;
//     }
// }

