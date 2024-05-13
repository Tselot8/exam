//num 2
class Stack {
    private int top;
    private int capacity;
    private int[] stackArray;

    public Stack(int capacity) {
        this.capacity = capacity;
        stackArray = new int[capacity];
        top = -1; 
    }

    public void push(int data) {
        if (top == capacity - 1) {
            System.out.println("Stack is full. Cannot push " + data);
            return;
        }
        stackArray[++top] = data;
    }

    public int pop() {
        if (top == -1) {
            return -1; 
        }
        int poppedElement = stackArray[top--];
        return poppedElement;
    
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); 
        /**for (int i = 0; i < stack.size(); i++) {
            System.out.println("Element at index " + i + ": " + stack.get(i));
        }**/
     
     }
}
