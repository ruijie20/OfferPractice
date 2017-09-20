import java.util.LinkedList;

public class MyStack<T> {
    private LinkedList<T> linkedList1 = new LinkedList<>();
    private LinkedList<T> linkedList2 = new LinkedList<>();

    public void add(T t) {
        if(linkedList2.isEmpty()){
            linkedList1.add(t);
        } else {
            linkedList2.add(t);
        }
    }

    public T push() {
        if(linkedList1.isEmpty() && linkedList2.isEmpty()){
            throw new RuntimeException("Stack is empty!");
        }

        if(!linkedList1.isEmpty()){
            moveElement(linkedList1, linkedList2);
            return linkedList1.poll();
        } else {
            moveElement(linkedList2, linkedList1);
            return linkedList2.poll();
        }
    }

    private void moveElement(LinkedList<T> fromList, LinkedList<T> toList) {
        int size1 = fromList.size() - 1;
        for (int i1 = 0; i1 < size1; i1++) {
            toList.add(fromList.poll());
        }
    }

}
