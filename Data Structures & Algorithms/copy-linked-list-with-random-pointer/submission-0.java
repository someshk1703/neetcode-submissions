/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        
        // Pass 1: Interleave clone nodes with original nodes
        Node curr = head;
        while (curr != null) {
            Node clone = new Node(curr.val);
            clone.next = curr.next;
            curr.next = clone;
            curr = clone.next;
        }
        
        // Pass 2: Connect random pointers for the clone nodes
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                // The clone's random is the clone of the original's random
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next; // Move to the next original node
        }
        
        // Pass 3: Detach the original and cloned lists
        curr = head;
        Node cloneHead = head.next;
        Node currClone = cloneHead;
        
        while (curr != null) {
            curr.next = curr.next.next; // Restore original node's next
            curr = curr.next;
            
            if (currClone.next != null) {
                currClone.next = currClone.next.next; // Connect clone node's next
                currClone = currClone.next;
            }
        }
        
        return cloneHead;
    }
}