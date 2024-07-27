import java.util.Stack;

public class StacksDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("JavaScript");

        // Displaying the elements in the stack
        System.out.println("Stack: " + stack);

        // Popping elements from the stack
        System.out.println("Popped element: " + stack.pop());

        // Peeking at the top element
        System.out.println("Top element: " + stack.peek());

        // Searching for an element
        System.out.println("Position of 'Java': " + stack.search("Java"));

        // Displaying the final state of the stack
        System.out.println("Final Stack: " + stack);
    }
}
