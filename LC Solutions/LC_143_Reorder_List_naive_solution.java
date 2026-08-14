public class LC_143_Reorder_List_naive_solution {
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
        public void reorderList(ListNode head) {
            List<ListNode> nodes = new ArrayList<>(); // will store all the nodes

            // traverse through the list,
            for(ListNode ptr = head; ptr != null; ptr = ptr.next) {
                nodes.add(ptr);
            }

            int size = nodes.size(); // good to have size in a variable
            int begPtr = 1, endPtr = size - 1;

            // restructure the list,
            for(int idx = 1; idx < size; idx++, head = head.next) { // skip first index because head is pointing to it
                if(idx % 2 == 1) { // if idx is odd then put endPtr
                    head.next = nodes.get(endPtr--); // in odd position add from the end
                } else { // if idx is even then put begPtr
                    head.next = nodes.get(begPtr++);  // in even position add from the beginning
                }
            }

            head.next = null;  // the last node should point to null
        }
    }

// naive solution - store all the nodes in an array
// now resturcture the list

// [1, 2, 3, 4]
// [0, 1, 2, 3]
}
