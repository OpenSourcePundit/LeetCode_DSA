import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.offer(x); // enqueue into q1
    }
    
    public int pop() {
        // move elements except last into q2
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }
        // last element = stack top
        int top = q1.poll();
        
        // swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        
        return top;
    }
    
    public int top() {
        // move elements except last into q2
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }
        // last element = stack top
        int top = q1.poll();
        q2.offer(top); // put it back since it's just peek
        
        // swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        
        return top;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}
