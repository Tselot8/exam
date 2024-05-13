import java.util.Stack;

class Queue {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();
    void enQueue(int x) {
        s1.push(x);
    }

    int deQueue() {
        if (s1.empty() && s2.empty()) {
            return -1; // Queue is empty
        }
        if (s2.empty()) {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println(q.deQueue()); // Output: -1 (Queue is empty)
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        System.out.println(q.deQueue()); // Output: 1
        System.out.println(q.deQueue()); // Output: 2
        System.out.println(q.deQueue()); // Output: 3
    }
}



