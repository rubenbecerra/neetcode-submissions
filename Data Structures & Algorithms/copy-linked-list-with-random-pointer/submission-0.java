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
        HashMap<Node,Node> list = new HashMap<>();
        Node curr = head;

        while (curr != null) {
            list.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            list.get(curr).next = list.get(curr.next);
            list.get(curr).random = list.get(curr.random);
            curr = curr.next;
        }
        return list.get(head);

        
        
    }
}
