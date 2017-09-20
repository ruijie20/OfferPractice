import java.util.Stack;

public class MyQueue<T> {
    private Stack<T> stackInput = new Stack<>();
    private Stack<T> stackOutput = new Stack<>();

    public void offer(T t) {
        stackInput.add(t);
    }

    public T poll() {
        if(stackOutput.isEmpty()){
            if(stackInput.isEmpty()){
                throw new RuntimeException("The queue is empty");
            } else{
                while (!stackInput.isEmpty()){
                    stackOutput.add(stackInput.pop());
                }
            }
        }
        return stackOutput.pop();
    }
}
