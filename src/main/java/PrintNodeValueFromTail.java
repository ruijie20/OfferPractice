import java.util.ArrayList;
import java.util.Stack;

public class PrintNodeValueFromTail {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode == null) {
            return new ArrayList<Integer>();
        }

        Stack stack = new Stack();
        stack.push(listNode.val);
        ListNode currentNode = listNode.next;

        while (currentNode != null) {
            stack.push(currentNode.val);
            currentNode = currentNode.next;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();

        while (!stack.isEmpty()) {
            list.add((Integer) stack.pop());
        }

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
