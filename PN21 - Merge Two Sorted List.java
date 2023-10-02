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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        // What is the role of the curr and curr.next ??
        // Basically in the linked list when we add or append the list , the element goes to the end of thee list ! curr variable performs to manage all element added to the list at the end.
        // curr.next is used to add element one by one! so that a list is created! curr do not have the head of the list so we can not return curr or curr.next to print the element of the list!
        
        // Check - list is empty or not bcoz if list is already empty we can not merge!
        while( list1 != null && list2 != null)
        {
            if(list1.val <= list2.val)
            {
                curr.next = list1;
                list1 = list1.next;
            }
            else
            {
                curr.next = list2;
                list2 = list2.next;
            }

            curr = curr.next;

        }

        curr.next = list1!=null ? list1 : list2;
        // Line number 35 is only used to store the last eleiment of the list , becoz last eliment did not compare with any of the eliment
        return temp.next;
        // we return temp.next becoz temp contains the head node so that we can traverse to the any element of the linked list
        // why can't we just return temp only instead of temp.text?? So the answer is only temp consist value 0 while initializing [check line number 14] 
        // and we want to print further element that was added later [excludind 0] that why we print temp.next!
        

    }
}
